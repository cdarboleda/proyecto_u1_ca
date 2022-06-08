package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService{

	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IDepositoRepository despositoRepository;
	
	@Override
	public void realizar(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		ctaDestino.setSaldo(saldoCtaDestino.add(monto));
		this.bancariaService.actualizar(ctaDestino);
		
		
		Deposito deposito = new Deposito();
		deposito.setFecha(LocalDateTime.now());
		deposito.setMonto(monto);
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		this.despositoRepository.insertarDeposito(deposito);
	}

}
