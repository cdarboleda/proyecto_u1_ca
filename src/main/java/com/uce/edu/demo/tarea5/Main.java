package com.uce.edu.demo.tarea5;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.ProyectoU1CaApplication;

@SpringBootApplication
public class Main implements CommandLineRunner{
	
	// 1) DI por atributo
	@Autowired
	private Matricula matricula;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ProyectoU1CaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		matricula.matricular("Cristian", "Arboleda", 22, "cdarboleda", 
				"Programacion Avanzada 2", "Sexto", 0, 
				"Edison Cayambe", "Tiempo Completo", LocalDateTime.now());
		
		System.out.println("DI por atributo\n"+matricula.toString()+"\n");
		System.out.println("DI por constructor\n"+matricula.printEstudianteAsignatura()+"\n");
		System.out.println("DI por SET\n"+matricula.printProfesor()+"\n");
	
	}

}
