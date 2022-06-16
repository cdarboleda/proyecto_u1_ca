package com.uce.edu.demo.tarea10.colecciondeunartista.modelo;

import java.util.List;

public class Coleccion {
	private String nombreColeccion;
	private Artista artista;
	private List<Cancion> coleccion;
	private String descripcion;
	
	@Override
	public String toString() {
		return "Coleccion de "+artista+ "\nNombre de la coleccion: "+ nombreColeccion + "\nDescripcion: "+descripcion+"\nLista de canciones: \n"+coleccion;
	}
	
	//SET Y GET
	public String getNombreColeccion() {
		return nombreColeccion;
	}
	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	public List<Cancion> getColeccion() {
		return coleccion;
	}
	public void setColeccion(List<Cancion> coleccion) {
		this.coleccion = coleccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
