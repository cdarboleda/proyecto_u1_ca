package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {
	public void realizarRetiro(String ctaOrigen, BigDecimal monto);
	public Retiro buscarRetiro(String id);
	public void eliminar(String id);
}
