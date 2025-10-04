package com.unbosque.formulariothymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unbosque.formulariothymeleaf.model.User;

@Controller
public class UserController {
  

	@GetMapping("/registrar")

	public String mostrarFormulario(Model model) {

		User user = new User();
		model.addAttribute("user", user);
		
	    List<String> profesiones = Arrays.asList("Programador, Enermera,Proesor");
	    model.addAttribute("profesiones", profesiones);
	    
	    return "registrar_form";

	}
}
