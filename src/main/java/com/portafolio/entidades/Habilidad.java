package com.portafolio.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habilidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHabilidad;
	private String nombre;
	private String urlImagen;
	private boolean alta;
	private Date fechaCreacion;
	public Habilidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Habilidad(Integer idHabilidad, String nombre, Integer experiencia, String urlImagen, boolean alta,
			Date fechaCreacion) {
		super();
		this.idHabilidad = idHabilidad;
		this.nombre = nombre;
		this.urlImagen = urlImagen;
		this.alta = alta;
		this.fechaCreacion = fechaCreacion;
	}
	

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public Integer getIdHabilidad() {
		return idHabilidad;
	}
	public void setIdHabilidad(Integer idHabilidad) {
		this.idHabilidad = idHabilidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isAlta() {
		return alta;
	}
	public void setAlta(boolean alta) {
		this.alta = alta;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
	
}
