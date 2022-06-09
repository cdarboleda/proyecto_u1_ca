package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void ingresarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado un nuevo retiro: "+ r);
	}

	@Override
	public Retiro buscarRetiro(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha encontrado la información del retiro: "+ id);
		Retiro r = new Retiro();
		r.setIdRegistro(id);
		return r;
	}

	@Override
	public void eliminarRetiro(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro: "+ id);
	}

}
