package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {
	public void crear(Inventario i);
	public Inventario devolver();
	public void actualizar(Inventario i);
	public void eliminar();
	public void addProducto(Producto p);
}
