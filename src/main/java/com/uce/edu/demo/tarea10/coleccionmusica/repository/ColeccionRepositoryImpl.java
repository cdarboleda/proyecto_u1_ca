package com.uce.edu.demo.tarea10.coleccionmusica.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tarea10.colecciondeunartista.modelo.Coleccion;

@Repository
public class ColeccionRepositoryImpl implements IColeccionRepository {

	@Override
	public void crear(Coleccion c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha agregado una nueva colección: " + c);
	}

	@Override
	public Coleccion devolver(String nombre) {
		// TODO Auto-generated method stub
		// Devolviendo información desde la base de datos
		Coleccion c = new Coleccion();
		c.setDescripcion("Descripcion por defecto");
		c.setNombreColeccion("Coleccion por defecto");
		c.setColeccion(null);
		return c;
	}

	@Override
	public void actualizar(Coleccion c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base de datos la colección " + c.getNombreColeccion());
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado de la base de datos la colección " + nombre);

	}

}
