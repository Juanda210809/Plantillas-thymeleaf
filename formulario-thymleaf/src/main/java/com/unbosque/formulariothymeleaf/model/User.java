package com.unbosque.formulariothymeleaf.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	private String nombre;
	private String email;
	private String password;
	private String genero;
	private String nota;
	private boolean matrimonio;
	private Date fechaNacimiento;
	private String profesion;
	private long ingreso;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public boolean isMatrimonio() {
		return matrimonio;
	}
	public void setMatrimonio(boolean matrimonio) {
		this.matrimonio = matrimonio;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public long getIngreso() {
		return ingreso;
	}
	public void setIngreso(long ingreso) {
		this.ingreso = ingreso;
	}
	
	
}
