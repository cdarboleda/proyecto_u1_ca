package com.uce.edu.demo.tarea5;

import org.springframework.stereotype.Component;

@Component
public class Asignatura {

	private String nombre;
	private String semestre;
	private float precio;
	
	@Override
	public String toString() {
		return "Nombre asignatura: " + nombre + ", Semestre: " + semestre + ", "+ "Precio: " + precio;
	}

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
