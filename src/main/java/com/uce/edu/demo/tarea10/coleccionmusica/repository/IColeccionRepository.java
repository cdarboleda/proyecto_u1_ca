package com.uce.edu.demo.tarea10.coleccionmusica.repository;

import com.uce.edu.demo.tarea10.colecciondeunartista.modelo.Coleccion;

public interface IColeccionRepository {
	public void crear(Coleccion c);
	public Coleccion devolver(String nombre);
	public void actualizar(Coleccion c);
	public void eliminar(String nombre);
}
