package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos" + t);
	}

	@Override
	public Transferencia buscar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia "+ id +" encontrada");
		Transferencia t = new Transferencia();
		t.setIdTransferencia(id);
		return t;
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia "+ id +" eliminada de la base de datos");
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaConsultada = new ArrayList<>();
		Transferencia trans1 = new Transferencia();
		trans1.setIdTransferencia("asdda");
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("6547");
		
		Transferencia trans2 = new Transferencia();
		trans2.setIdTransferencia("ggfxc");
		trans2.setFechaTransferencia(LocalDateTime.now());
		trans2.setMontoTransferir(new BigDecimal(100));
		trans2.setNumeroCuentaDestino("3434");
		trans2.setNumeroCuentaOrigen("8708");
		
		listaConsultada.add(trans1);
		listaConsultada.add(trans2);
		return listaConsultada;
	}

}
