package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public void ingresar(String nombre, int cantidad, BigDecimal precioDist, LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.setNombre(nombre);
		p.setCantidad(cantidad);
		MathContext m = new MathContext(2);
		p.setPrecioDistribuidor(precioDist.round(m));
		p.setFechaIngreso(fechaIngreso);
		
		this.productoRepository.crear(p);
	}

	@Override
	public Producto buscarPorNombre(String nombreP) {
		// TODO Auto-generated method stub
		return this.productoRepository.buscar(nombreP);
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		this.productoRepository.actualizar(p);
	}

	@Override
	public void retirarPorNombre(String nombreP) {
		// TODO Auto-generated method stub
		this.productoRepository.eliminar(nombreP);
	}

}
