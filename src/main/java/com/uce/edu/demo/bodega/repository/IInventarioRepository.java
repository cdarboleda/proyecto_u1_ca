package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IInventarioRepository {
	public void realizar(Inventario i);
	public Inventario devolver();
	public void actualizar(Inventario i);
	public void borrar();
}
