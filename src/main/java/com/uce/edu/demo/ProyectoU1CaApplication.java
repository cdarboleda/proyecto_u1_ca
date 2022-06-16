package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.tarea10.colecciondeunartista.modelo.Artista;
import com.uce.edu.demo.tarea10.colecciondeunartista.modelo.Cancion;
import com.uce.edu.demo.tarea10.coleccionmusica.service.IColeccionService;

@SpringBootApplication
public class ProyectoU1CaApplication implements CommandLineRunner{

	@Autowired
	private IColeccionService coleccionService;
	
	@Autowired
	private Cancion cancion1;
	@Autowired
	private Cancion cancion2;
	@Autowired
	private Artista artista1;
	@Autowired
	private Artista artista2;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("\nEjemplo Singleton");
		System.out.println("Creamos un artista: ");
		this.artista1.setNombre("Jamiroquai");
		System.out.println(this.artista1);
		System.out.println("Creamos un segundo artista: ");
		this.artista2.setNombre("Simply Red");
		System.out.println(this.artista2);
		System.out.println("Volvemos a imprimir al artista 1: ");
		System.out.println(this.artista1);
		System.out.println("Se modificó debido a que existe una unica instancia (Singleton)");
		
		System.out.println("\nEjemplo Prototype");
		System.out.println("Creamos una canción con información específica: ");
		this.cancion1.setNombre("Cancion 1");
		this.cancion1.setFechaPub(LocalDateTime.of(2000, 1,5,0,0));
		System.out.println(this.cancion1);
		System.out.println("Creamos una segunda canción con información diferente: ");
		this.cancion2.setNombre("Cancion 2");
		this.cancion2.setFechaPub(LocalDateTime.of(2000, 2,10,0,0));
		System.out.println(this.cancion2);        
		System.out.println("Volvemos a imprimir cancion 1");
		System.out.println(this.cancion1);
		System.out.println("Los resultados son tal y como fueron declarados, son particulares (Prototype)");
		
		System.out.println();
		List<Cancion> listaCanciones = new ArrayList<>();
		listaCanciones.add(cancion1);
		listaCanciones.add(cancion2);
		this.coleccionService.agregar("Greatest Hits", "Mejores éxitos", listaCanciones);
	}

}
