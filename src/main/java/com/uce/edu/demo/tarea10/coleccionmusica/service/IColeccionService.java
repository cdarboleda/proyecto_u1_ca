package com.uce.edu.demo.tarea10.coleccionmusica.service;

import java.util.List;

import com.uce.edu.demo.tarea10.colecciondeunartista.modelo.Cancion;
import com.uce.edu.demo.tarea10.colecciondeunartista.modelo.Coleccion;

public interface IColeccionService {
	public void agregar(String nombre, String descripcion, List<Cancion> lista);
	public Coleccion devolver(String nombre);
	public void actualizar(Coleccion c);
	public void eliminar(String nombre);
}
