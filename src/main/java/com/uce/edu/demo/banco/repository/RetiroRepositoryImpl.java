package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiros = new ArrayList<>();
		Retiro reti1 = new Retiro();
		reti1.setFecha(LocalDateTime.of(2022,12,20,13,50,2));
		reti1.setIdRegistro("2sda");
		reti1.setMonto(new BigDecimal(50));
		
		Retiro reti2 = new Retiro();
		reti2.setFecha(LocalDateTime.of(2021,3,15,9,31,5));
		reti2.setIdRegistro("sdfaf2");
		reti2.setMonto(new BigDecimal(150));
		
		listaRetiros.add(reti1);
		listaRetiros.add(reti2);
		return listaRetiros;
	}

}
