package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorInventarioService {
	
	public void addProducto(String nombre, int cantidad, BigDecimal precioDist, LocalDateTime fechaIngreso);
	public void consultarReporte(LocalDateTime desde);
}
