package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;

public class Retiro {

	private String idRegistro;
	private String ctaOrigen;
	private BigDecimal monto;
	
	@Override
	public String toString() {
		return "Retiro [idRegistro=" + idRegistro + ", ctaOrigen=" + ctaOrigen + ", monto=" + monto + "]";
	}
	
	//SET Y GET
	public String getCtaOrigen() {
		return ctaOrigen;
	}
	public void setCtaOrigen(String ctaOrigen) {
		this.ctaOrigen = ctaOrigen;
	}
	public String getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	
}
