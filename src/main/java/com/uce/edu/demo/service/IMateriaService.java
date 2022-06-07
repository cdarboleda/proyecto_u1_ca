package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {
	public void crearMateria(Materia m);
	public void buscarMateria(String id);
	public void actualizarMateria(Materia m);
	public void eliminarMateria(String id);
}
