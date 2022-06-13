package com.uce.edu.demo.bodega.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReporteTo {
	
	private String nombre;
	private int cantidad;
	private BigDecimal precioV;	
	private LocalDateTime fechaIngresoBodega;
	
	@Override
	public String toString() {
		return nombre + " - " + cantidad + " - $" + precioV
				+ " - " + fechaIngresoBodega;
	}
	
	//SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecioV() {
		return precioV;
	}
	public void setPrecioV(BigDecimal precioV) {
		this.precioV = precioV;
	}
	public LocalDateTime getFechaIngresoBodega() {
		return fechaIngresoBodega;
	}
	public void setFechaIngresoBodega(LocalDateTime fechaIngresoBodega) {
		this.fechaIngresoBodega = fechaIngresoBodega;
	}
	
	
}
