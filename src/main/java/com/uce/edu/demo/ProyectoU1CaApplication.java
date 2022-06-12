package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.service.IGestorInventarioService;

@SpringBootApplication
public class ProyectoU1CaApplication implements CommandLineRunner{

	@Autowired
	private IGestorInventarioService gestorInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.gestorInventarioService.addProducto("Manzana", 50,new BigDecimal(0.5), LocalDateTime.of(2022,6,10,0,0));
		this.gestorInventarioService.addProducto("Leche", 100,new BigDecimal(1.25), LocalDateTime.of(2022,6,9,0,0));
		this.gestorInventarioService.addProducto("Pan", 175,new BigDecimal(0.2), LocalDateTime.of(2022,6,8,0,0));
		this.gestorInventarioService.addProducto("Aceite", 36,new BigDecimal(2.75), LocalDateTime.of(2022,6,11,0,0));
		this.gestorInventarioService.addProducto("Atún", 25,new BigDecimal(1), LocalDateTime.of(2022,6,5,0,0));
		
		this.gestorInventarioService.consultarReporte(LocalDateTime.of(2022, 6, 8, 0, 0));
	}

}
