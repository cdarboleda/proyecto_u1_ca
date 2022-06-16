package com.uce.edu.demo.tarea10.colecciondeunartista.modelo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cancion {
	private String nombre;
	private LocalDateTime fechaPub;

	@Override
	public String toString() {
		return "Cancion: [" + "Nombre: " + nombre + "; Fecha de publicacion: " + fechaPub+"]";
	}

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaPub() {
		return fechaPub;
	}

	public void setFechaPub(LocalDateTime fechaPub) {
		this.fechaPub = fechaPub;
	}

}
