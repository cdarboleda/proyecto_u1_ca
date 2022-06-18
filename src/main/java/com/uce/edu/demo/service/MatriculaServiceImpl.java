package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.MatriculaRepositoryImpl;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private MatriculaRepositoryImpl matricula;
	@Autowired
	private ProfesorGeneral profesorGeneral;
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria profeM = new ProfesorMateria();
		profeM.setApellido("Tapia");
		profeM.setNombre("Jose");
		return profeM;
	}
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		return null;
	}
	
	@Override
	public void crearMatricula(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON " + this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE " + this.profesorMateria);
		
		System.out.println("DI desde un metodo profesor general: " + this.obtenerProfesorG());
		System.out.println("DI desde un metodo profesor materia: " + this.obtenerProfesorM());
		this.matricula.insertar(m);
	}

	@Override
	public void buscarMatricula(String id) {
		// TODO Auto-generated method stub
		this.matricula.buscar(id);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matricula.actualizar(m);
	}

	@Override
	public void eliminarMatricula(String id) {
		// TODO Auto-generated method stub
		this.matricula.eliminar(id);
	}

	

}
