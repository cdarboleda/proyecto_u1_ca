package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	public void insertar(Matricula m);
	public Matricula buscar(String id);
	public void actualizar(Matricula m);
	public void eliminar(String id);
}
