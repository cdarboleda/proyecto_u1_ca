package com.uce.edu.demo.tarea5;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Matricula {

	private String idMatricula;
	private LocalDateTime fechaMatricula;
	private Estudiante estudiante;
	private Asignatura asignatura;
	private Profesor profesor;

	// 2) DI por constructor
	public Matricula(Estudiante estudiante, Asignatura asignatura) {
		this.estudiante = estudiante;
		this.asignatura = asignatura;
	}

	public void matricular(String nombre, String apellido, int edad, String correo, String nombreAsig, String semestre,
			float precio, String nombreProfesor, String tipoContrato, LocalDateTime fechaMatricula) {

		this.idMatricula = crearId(nombre, apellido);
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		this.estudiante.setEdad(edad);
		this.estudiante.setCorreo(correo);

		this.asignatura.setNombre(nombreAsig);
		this.asignatura.setPrecio(precio);
		this.asignatura.setSemestre(semestre);

		//3) DI por SET
		this.profesor.setNombre(nombreProfesor);
		this.profesor.setTipoContrato(tipoContrato);

		this.fechaMatricula = fechaMatricula;
	}

	private String crearId(String nombre, String apellido) {
		return nombre.substring(0, 3).toLowerCase() + apellido.substring(0, 3).toLowerCase();
	}
	
	public String printProfesor() {
		return this.profesor.toString();
	}
	
	public String printEstudianteAsignatura() {
		return this.estudiante.toString()+" "+this.asignatura.toString(); 
	}

	@Override
	public String toString() {
		return "Matricula\n"+ "id: " + idMatricula + ", Fecha: " + fechaMatricula + ",\nEstudiante:\n" + estudiante
				+ ",\nAsignatura:\n" + asignatura+ "\nProfesor:\n"+ profesor+"\n";
	}

	// SET y GET
	
	@Autowired
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	public String getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(String idMatricula) {
		this.idMatricula = idMatricula;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public Profesor getProfesor() {
		return profesor;
	}

}
