package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Deposito {
	private String idDeposito;
	private LocalDateTime fecha;
	private String numeroCuentaDestino;
	private BigDecimal monto;
	
	@Override
	public String toString() {
		return "Deposito [id= "+idDeposito+" fecha=" + fecha + ", numeroCuentaDestino=" + numeroCuentaDestino + ", monto=" + monto + "]";
	}
	
	//SET Y GET
	public String getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(String idDeposito) {
		this.idDeposito = idDeposito;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
}
