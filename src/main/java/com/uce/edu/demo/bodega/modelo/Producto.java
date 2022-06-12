package com.uce.edu.demo.bodega.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {
	private String nombre;
	private int cantidad;
	private LocalDateTime fechaIngreso;
	private BigDecimal precioDistribuidor;
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", fechaIngreso="
				+ fechaIngreso + ", precioDistribuidor=" + precioDistribuidor + "]";
	}
	
	//SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecioDistribuidor() {
		return precioDistribuidor;
	}
	public void setPrecioDistribuidor(BigDecimal precioDistribuidor) {
		this.precioDistribuidor = precioDistribuidor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
}
