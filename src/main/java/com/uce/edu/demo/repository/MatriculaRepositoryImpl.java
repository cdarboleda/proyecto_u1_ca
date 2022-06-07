package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado una matricula: "+ m);
	}

	@Override
	public Matricula buscar(String id) {
		// TODO Auto-generated method stub
		Matricula m = new Matricula();
		m.setNumero(id);
		System.out.println("Se ha buscado en la base de datos la matricula: "+ id);
		return m;
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la matricula: "+m);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la matricula: "+ id);
	}

}
