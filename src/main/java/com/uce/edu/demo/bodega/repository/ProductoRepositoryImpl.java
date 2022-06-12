package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	
	@Override
	public void crear(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha añadido a la base de datos el producto: "+ p);
	}

	@Override
	public Producto buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Producto encontrado: " + nombre);
		Producto p = new Producto();
		p.setNombre(nombre);
		p.setCantidad(10);
		p.setFechaIngreso(LocalDateTime.of(1999, 1, 1, 1, 1));
		p.setPrecioDistribuidor(new BigDecimal(9.99));
		return p;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base de datos el producto : "+ p.getNombre());
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base de datos el producto: "+ nombre);
	}

}
