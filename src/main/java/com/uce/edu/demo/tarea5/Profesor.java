package com.uce.edu.demo.tarea5;

import org.springframework.stereotype.Component;

@Component
public class Profesor {
	private String nombre;
	private String tipoContrato;

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Tipo de Contrato: " + tipoContrato;
	}

	// SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}
