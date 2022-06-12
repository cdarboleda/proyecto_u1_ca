package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{
	
	@Override
	public void realizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado el inventario en la DB!!");
	}

	@Override
	public Inventario devolver() {
		// TODO Auto-generated method stub
		System.out.println("Devolviendo el inventario de la DB...");
		
		//Simulamos que el inventario en DB tiene estos 4 productos
		Inventario i = new Inventario();
		List<Producto> listaConsultada = new ArrayList<>();
		Producto producto1 = new Producto();
		producto1.setNombre("Manzana");
		producto1.setCantidad(50);
		producto1.setFechaIngreso(LocalDateTime.of(2022,6,10,0,0));
		producto1.setPrecioDistribuidor(new BigDecimal(0.5));
		
		Producto producto2 = new Producto();
		producto2.setNombre("Leche");
		producto2.setCantidad(100);
		producto2.setFechaIngreso(LocalDateTime.of(2022,6,9,0,0));
		producto2.setPrecioDistribuidor(new BigDecimal(1.25));
		
		Producto producto3 = new Producto();
		producto3.setNombre("Pan");
		producto3.setCantidad(175);
		producto3.setFechaIngreso(LocalDateTime.of(2022,6,8,0,0));
		producto3.setPrecioDistribuidor(new BigDecimal(0.2));
		
		Producto producto4 = new Producto();
		producto4.setNombre("Aceite");
		producto4.setCantidad(36);
		producto4.setFechaIngreso(LocalDateTime.of(2022,6,11,0,0));
		producto4.setPrecioDistribuidor(new BigDecimal(2.75));
		
		Producto producto5 = new Producto();
		producto5.setNombre("Atún");
		producto5.setCantidad(25);
		producto5.setFechaIngreso(LocalDateTime.of(2022,6,5,0,0));
		producto5.setPrecioDistribuidor(new BigDecimal(1));
		
		listaConsultada.add(producto1);
		listaConsultada.add(producto2);
		listaConsultada.add(producto3);
		listaConsultada.add(producto4);
		listaConsultada.add(producto5);
		i.setListaProductos(listaConsultada);
		
		return i;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario completamente");
	}

	@Override
	public void borrar() {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el inventario!");
	}


}
