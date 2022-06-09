package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	public void ingresarRetiro(Retiro r);
	public Retiro buscarRetiro(String id);
	public void eliminarRetiro(String id);
}
