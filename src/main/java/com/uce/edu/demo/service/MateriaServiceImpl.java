package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.MateriaRepositoryImpl;

@Service
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	private MateriaRepositoryImpl materia;
	
	@Override
	public void crearMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materia.insertar(m);
	}

	@Override
	public void buscarMateria(String id) {
		// TODO Auto-generated method stub
		this.materia.buscar(id);
	}

	@Override
	public void actualizarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materia.actualizar(m);
	}

	@Override
	public void eliminarMateria(String id) {
		// TODO Auto-generated method stub
		this.materia.eliminar(id);
	}

}
