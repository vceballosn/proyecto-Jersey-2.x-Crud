package com.proyectoJerseyCrud.repositorio;

import java.util.List;

import com.proyectoJerseyCrud.modelo.Catdestino;

public interface DestinoRepositorio {
	
	public Catdestino merge(Catdestino destino);
	public List<Catdestino> getAllDestino();
	public Catdestino delete(Catdestino destino);
	public Catdestino objetoId(long id);

}
