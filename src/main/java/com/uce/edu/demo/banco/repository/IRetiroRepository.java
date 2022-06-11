package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	public void ingresarRetiro(Retiro r);
	public Retiro buscarRetiro(String id);
	public void eliminarRetiro(String id);
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
