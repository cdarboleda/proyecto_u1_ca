package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {
	public void ingresar(String nombre, int cantidad, BigDecimal precioDist, LocalDateTime fechaIngreso);
	public Producto buscarPorNombre(String nombreP);
	public void actualizar(Producto p);
	public void retirarPorNombre(String nombreP);
}
