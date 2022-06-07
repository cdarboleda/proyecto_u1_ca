package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1CaApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	@Autowired
	private IMateriaService materiaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//ESTUDIANTE
		Estudiante e = new Estudiante();
		e.setNombre("Cristian");
		e.setApellido("Arboleda");
		e.setCedula("1751146786");
		
		this.estudianteService.ingresarEstudiante(e);//Ingresar
		e.setCedula("1752657895");
		this.estudianteService.actualizarEstudiante(e);//Actualizar
		this.estudianteService.buscarPorApellido("Arboleda");//Buscar
		this.estudianteService.borrarEstudiante("Arboleda");//Borrar
		
		//MATERIA
		Materia materia1 = new Materia();
		materia1.setNombre("Programacion Avanzada 2");
		materia1.setSemestre("2022-2022");
		
		Materia materia2 = new Materia();
		materia2.setNombre("Inteligencia Artificial");
		materia2.setSemestre("2022-2022");
		
		this.materiaService.crearMateria(materia1);//Ingresar
		this.materiaService.buscarMateria("Programacion Avanzada 2");//Buscar
		materia1.setNombre("Programacion Avanzada II");
		this.materiaService.actualizarMateria(materia1);//Actualizar
		this.materiaService.eliminarMateria("Programacion Avanzada II");//Borrar
		
		List<Materia> listaMaterias = new ArrayList<Materia>();
		listaMaterias.add(materia1);
		listaMaterias.add(materia2);
		
		//MATRICULA
		Matricula matricula1 = new Matricula();
		matricula1.setNumero("45621");
		matricula1.setEstudiante(e);
		matricula1.setMateria(listaMaterias);
		
		this.matriculaService.crearMatricula(matricula1);//Ingresar
		this.matriculaService.buscarMatricula("45621");//Buscar
		matricula1.setNumero("12345");
		this.matriculaService.actualizarMatricula(matricula1);//Actualizar
		this.matriculaService.eliminarMatricula("12345");//Borrar
	}

}
