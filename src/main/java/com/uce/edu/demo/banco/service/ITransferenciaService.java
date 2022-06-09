package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	//la "realizacion" de la transferencia como logica de negocio
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	//public void actualizar(Transferencia t);
	public Transferencia buscarTransferencia(String id);
	public void eliminarTransferencia(String id);
}
