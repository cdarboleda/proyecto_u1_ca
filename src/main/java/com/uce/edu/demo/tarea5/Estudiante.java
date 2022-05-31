package com.uce.edu.demo.tarea5;

import org.springframework.stereotype.Component;

@Component
public class Estudiante {

	private String nombre;
	private String apellido;
	private int edad;
	private String correo;

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Correo: " + correo;
	}

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
