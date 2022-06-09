package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		//Aqui va los queries de base de datos
		System.out.println("Cuenta Bancaria actualizada: " + c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta bancaria: "+ numero);
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNumero(numero);
		cuenta.setSaldo(new BigDecimal(100));
		return cuenta;
	}

	@Override
	public void crear(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta Bancaria creada: "+ c);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta Bancaria eliminada: "+ numero);
	}

}
