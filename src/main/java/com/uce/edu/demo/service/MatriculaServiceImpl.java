package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.MatriculaRepositoryImpl;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private MatriculaRepositoryImpl matricula;
	
	@Override
	public void crearMatricula(Matricula m) {
		// TODO Auto-generated method stub
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
