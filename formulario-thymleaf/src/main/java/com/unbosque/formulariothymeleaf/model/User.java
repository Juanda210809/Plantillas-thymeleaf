package com.unbosque.formulariothymeleaf.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor


public class User {

	private String nombre;
	private String mail;
	private String password;
	private String genero;
	private String nota;
	private boolean matrimonio;
	private Date fechaNacimiento;
	private String profesion;
	private long ingreo;

}
