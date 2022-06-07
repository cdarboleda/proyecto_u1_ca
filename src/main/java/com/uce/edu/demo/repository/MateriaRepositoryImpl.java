package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository{

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado la materia: "+ m);
	}

	@Override
	public Materia buscar(String id) {
		// TODO Auto-generated method stub
		Materia m = new Materia();
		m.setNombre(id);
		return m;
	}

	@Override
	public void actualizar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la materia "+ m);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la materia "+ id);
	}

}
