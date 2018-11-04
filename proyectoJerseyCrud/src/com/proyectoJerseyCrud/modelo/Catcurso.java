package com.proyectoJerseyCrud.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the catcurso database table.
 * 
 */
@Entity
@NamedQuery(name="Catcurso.findAll", query="SELECT c FROM Catcurso c")
public class Catcurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCurso;

	private String descripcion;

	private short estatus;

	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	private String nombre;

	public Catcurso() {
	}

	public int getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public short getEstatus() {
		return this.estatus;
	}

	public void setEstatus(short estatus) {
		this.estatus = estatus;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}