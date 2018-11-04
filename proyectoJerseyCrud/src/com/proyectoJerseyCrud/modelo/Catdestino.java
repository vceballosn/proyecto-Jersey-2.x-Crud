package com.proyectoJerseyCrud.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catdestinos database table.
 * 
 */
@Entity
@Table(name="catdestinos")
@NamedQuery(name="Catdestino.findAll", query="SELECT c FROM Catdestino c")
public class Catdestino implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idDestino;
    
	@Column(name="descripcion")
	private String descripcion;
    
	@Column(name="estatus")
	private boolean estatus;
	
	@Column(name="nombre")
	private String nombre;

	public Catdestino() {
	}

	public long getIdDestino() {
		return this.idDestino;
	}

	public void setIdDestino(long idDestino) {
		this.idDestino = idDestino;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getEstatus() {
		return this.estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}