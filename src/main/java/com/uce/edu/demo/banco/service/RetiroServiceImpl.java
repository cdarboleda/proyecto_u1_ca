package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService{
	
	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Autowired
	private ICuentaBancariaService cuentaBService;
	
	@Override
	public void realizarRetiro(String ctaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cB = this.cuentaBService.buscar(ctaOrigen);
		cB.setSaldo(cB.getSaldo().subtract(monto));
		
		Retiro r = new Retiro();
		r.setIdRegistro(String.valueOf(Math.random()*100-1));
		r.setMonto(monto);
		r.setCtaOrigen(ctaOrigen);
		this.cuentaBService.actualizar(cB);
		this.retiroRepository.ingresarRetiro(r);	
	}

	@Override
	public Retiro buscarRetiro(String id) {
		// TODO Auto-generated method stub
		this.retiroRepository.buscarRetiro(id);
		return null;
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminarRetiro(id);
	}

}
