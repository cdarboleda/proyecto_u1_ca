package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		//Crear en la base de datos el repositorio
		System.out.println("Se creó el depósito: " + d);
	}

	@Override
	public Deposito buscarDeposito(String numero) {
		// TODO Auto-generated method stub
		Deposito d = new Deposito();
		d.setIdDeposito(numero);
		System.out.println("Depósito encontrado: "+ numero);
		return d;
	}

	@Override
	public void eliminarDeposito(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Depósito eliminado de la base de datos: "+ numero);
	}

}
