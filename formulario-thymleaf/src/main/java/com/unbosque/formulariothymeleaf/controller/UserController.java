package com.unbosque.formulariothymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.unbosque.formulariothymeleaf.model.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/registrar")
	public String mostrarFormulario(Model model) {

		User user = new User();
		model.addAttribute("user", user);

		List<String> profesiones = Arrays.asList("Programador", "Enermera", "Proesor");
		model.addAttribute("profesiones", profesiones);

		return "registrar_form";

	}

	@PostMapping("/registrar")
	// @Valid anotacion para validar toas las validaciones que se estan
	// especificando en el modelo
	// BindingResult bindingResult para obtener os errores al validar
	public String submitFormulario(@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {
		System.out.println(user.toString());
		if (bindingResult.hasErrors()) {

			List<String> profesiones = Arrays.asList("Programador", "Enermera", "Proesor");
			model.addAttribute("profesiones", profesiones);
			return "registrar_form";
		} else {

			return "registro_success";
		}
	}

}
