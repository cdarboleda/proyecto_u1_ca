package com.uce.edu.demo.tarea10.coleccionmusica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tarea10.colecciondeunartista.modelo.Artista;
import com.uce.edu.demo.tarea10.colecciondeunartista.modelo.Cancion;
import com.uce.edu.demo.tarea10.colecciondeunartista.modelo.Coleccion;
import com.uce.edu.demo.tarea10.coleccionmusica.repository.IColeccionRepository;

@Service
public class ColeccionServiceImpl implements IColeccionService{

	@Autowired
	private IColeccionRepository coleccionRepository;
	@Autowired
	private Artista artista;
	
	@Override
	public void agregar(String nombre, String descripcion, List<Cancion> lista) {
		// TODO Auto-generated method stub
		Coleccion c = new Coleccion();
		c.setNombreColeccion(nombre);
		c.setArtista(artista);
		c.setDescripcion(descripcion);
		c.setColeccion(lista);
		
		this.coleccionRepository.crear(c);
		System.out.println("DI desde Service SINGLETON " + this.artista);
	}

	@Override
	public Coleccion devolver(String nombre) {
		// TODO Auto-generated method stub
		return this.coleccionRepository.devolver(nombre);
	}

	@Override
	public void actualizar(Coleccion c) {
		// TODO Auto-generated method stub
		this.coleccionRepository.actualizar(c);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		this.coleccionRepository.eliminar(nombre);
	}

}
