package com.uce.edu.demo.bodega.modelo;

import java.util.List;

public class Inventario {
	private List<Producto> listaProductos;
	
	//SET Y GET

	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(List<Producto> producto) {
		this.listaProductos = producto;
	}
	
}
