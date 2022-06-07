package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void crearMatricula(Matricula m);
	public void buscarMatricula(String id);
	public void actualizarMatricula(Matricula m);
	public void eliminarMatricula(String id);
}
