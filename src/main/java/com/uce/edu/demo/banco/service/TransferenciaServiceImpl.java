package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service	
public class TransferenciaServiceImpl implements ITransferenciaService{

	//Como la logica de CuentaBancariService no hace nada
	//Si puedo inyectar el CuentaBancariaRepository
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	//Aqui no usamos directamente del repository, sino que si añadimos logicadenegocio
	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);//Actualizar
		
		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		cDestino.setSaldo(saldoDestino.add(monto));
		this.bancariaService.actualizar(cDestino);//Actualizar
		
		//Aqui actualizamos en el repository (Base de datos)
		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		this.transferenciaRepository.insertar(t);
	}
	
	@Override
	public Transferencia buscarTransferencia(String id) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.buscar(id);
		return null;
	}
	@Override
	public void eliminarTransferencia(String id) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.eliminar(id);
	}

}
