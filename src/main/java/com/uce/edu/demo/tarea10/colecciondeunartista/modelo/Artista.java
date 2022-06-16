package com.uce.edu.demo.tarea10.colecciondeunartista.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Artista {
	private String nombre;
	
	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + "]";
	}

	//Set y get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
