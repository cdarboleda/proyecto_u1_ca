package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1CaApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante e = new Estudiante();
		e.setNombre("Cristian");
		e.setApellido("Arboleda");
		e.setCedula("1751146786");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("David");
		e1.setApellido("Jumbo");
		e1.setCedula("1862789726");
		this.estudianteService.ingresarEstudiante(e1);
		
		//Usar los 3 metodos restantes
		e.setCedula("1752657895");
		this.estudianteService.actualizarEstudiante(e);
		this.estudianteService.borrarEstudiante("Arboleda");
	}

}
