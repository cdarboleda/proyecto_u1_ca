package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;


@Service
public class FachadaCuentaBancariaService implements IFachadaCuentaBancaria{

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceA;
	@Autowired
	@Qualifier("futuro")
	private ICuentaBancariaService bancariaServiceF;
	
	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public BigDecimal calcularInteres(String numeroCta) {
		// TODO Auto-generated method stub
		BigDecimal interes = null;
		CuentaBancaria cta = this.bancariaRepository.buscar(numeroCta);
		System.out.println("El interés de su cuenta es de: ");
		if(cta.getTipo().equals("A")) {
			//Ahorros
			System.out.println("Cta Ahorros");
			interes =this.bancariaService.calcularInteres(cta.getSaldo());
		}else if(cta.getTipo().equals("C")) {
			//Corriente
			System.out.println("Cta Corriente");
			interes =this.bancariaServiceA.calcularInteres(cta.getSaldo());
		}else {
			//A Futuro
			System.out.println("Cta Ahorro Futuro");
			interes =this.bancariaServiceF.calcularInteres(cta.getSaldo());
		}
		return interes;
	}

}
