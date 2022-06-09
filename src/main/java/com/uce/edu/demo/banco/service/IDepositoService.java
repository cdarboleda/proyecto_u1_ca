package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {
	public void realizar(String numeroCtaDestino, BigDecimal monto);
	public Deposito buscarDeposito(String numero);
	//public void actualizarDeposito(Deposito d);
	public void eliminarDeposito(String numero);
}
