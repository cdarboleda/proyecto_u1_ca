package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaDepositos = new ArrayList<>();
		Deposito depo1 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021,2,10,8,50,2));
		depo1.setIdDeposito("2sda");
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("124560");
		
		Deposito depo2 = new Deposito();
		depo2.setFecha(LocalDateTime.of(2021,3,15,9,31,5));
		depo2.setIdDeposito("dsd2a");
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("124560");
		
		listaDepositos.add(depo2);
		listaDepositos.add(depo1);
		return listaDepositos;
	}

}
