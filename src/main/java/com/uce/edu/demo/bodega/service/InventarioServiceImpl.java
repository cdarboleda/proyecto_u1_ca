package com.uce.edu.demo.bodega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository inventarioRepository;

	@Override
	public void crear(Inventario i) {
		// TODO Auto-generated method stub
		this.inventarioRepository.realizar(i);
	}

	@Override
	public Inventario devolver() {
		// TODO Auto-generated method stub
		return this.inventarioRepository.devolver();
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		this.inventarioRepository.actualizar(i);
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		this.inventarioRepository.borrar();
	}

	@Override
	public void addProducto(Producto p) {
		// TODO Auto-generated method stub
		Inventario InventarioNuevo = this.inventarioRepository.devolver();
		InventarioNuevo.getListaProductos().add(p);
		this.inventarioRepository.actualizar(InventarioNuevo);
		System.out.println("Añadido el producto: "+ p.getNombre()+ " en el inventario");
	}

}
