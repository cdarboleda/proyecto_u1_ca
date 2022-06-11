package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

public interface IDepositoRepository {
	public void insertarDeposito(Deposito d);
	public Deposito buscarDeposito(String numero);
	//public void actualizarDeposito(Deposito d);
	public void eliminarDeposito(String numero);
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
