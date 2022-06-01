package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository{

	@Override
	public void insertar(Estudiante e) {
		// Aquí se realiza la insercion en la base
		System.out.println("Se ha insertado en la base de datos el estudiante: "+ e);
	}

	@Override
	public Estudiante buscar(String cedula) {
		System.out.println("Se ha buscado en la base de datos el estudiante: "+ cedula);

		return null;
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base de datos el estudiante: "+ e);

	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base de datos el estudiante: "+ cedula);

	}

}
