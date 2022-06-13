package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.to.ReporteTo;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {

	@Autowired
	private IInventarioService inventarioService;
	@Autowired
	private IProductoService productoService;

	@Override
	public void addProducto(String nombre, int cantidad, BigDecimal precioDist, LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		this.productoService.ingresar(nombre, cantidad, precioDist, fechaIngreso);

		// Como el producto que ingreso "no se guarda aun en la base de datos",
		// (el metodo devolver de producto me devuelve uno por defecto)
		// lo crearé directamente aqui para "usarlo" en el inventario
		Producto p = new Producto();
		p.setNombre(nombre);
		p.setCantidad(cantidad);
		p.setPrecioDistribuidor(precioDist);
		p.setFechaIngreso(fechaIngreso);
		this.inventarioService.addProducto(p);
	}

	@Override
	public void consultarReporte(LocalDateTime desde) {
		// TODO Auto-generated method stub
		System.out.println("Reporte de productos ingresados despues de: " + desde);
		System.out.println("Nombre  -  Cantidad  -  Precio Venta  - Fecha Ingreso");
		for (ReporteTo productoR : inventarioAReporte(desde)) {
			System.out.println(productoR);
		}
	}

	private BigDecimal precioVenta(Producto p) {
		// TODO Auto-generated method stub
		BigDecimal pC = p.getPrecioDistribuidor();
		BigDecimal g = pC.multiply(new BigDecimal(0.1));
		BigDecimal iva = pC.multiply(new BigDecimal(0.12));
		BigDecimal pV = pC.add(g).add(iva);
		
		MathContext m = new MathContext(2);
		
		return pV.round(m);
	}

	private List<ReporteTo> inventarioAReporte(LocalDateTime desde) {

		List<Producto> listaProductos = this.inventarioService.devolver().getListaProductos();
		List<ReporteTo> listaReporte = new ArrayList<>();
		for (Producto p : listaProductos) {
			if (p.getFechaIngreso().isAfter(desde)) {
				ReporteTo r = new ReporteTo();
				r.setCantidad(p.getCantidad());
				r.setFechaIngresoBodega(p.getFechaIngreso());
				r.setPrecioV(precioVenta(p));
				r.setNombre(p.getNombre());
				listaReporte.add(r);
			}

		}
		return listaReporte;
	}

}
