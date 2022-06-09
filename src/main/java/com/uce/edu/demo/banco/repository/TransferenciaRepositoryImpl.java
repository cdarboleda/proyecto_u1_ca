package com.uce.edu.demo.banco.repository;

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

}
