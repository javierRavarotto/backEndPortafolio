package com.portafolio.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProyecto;
	private String nombre;
	private String urlGithub;
	private String imagen;
	private String descripcion;
	private boolean alta;
	private Date fechaCreacion;
	public Proyecto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Proyecto(Integer idProyecto, String nombre, String urlGithub, String imagen, String descripcion,
			boolean alta, Date fechaCreacion) {
		super();
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.urlGithub = urlGithub;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.alta = alta;
		this.fechaCreacion = fechaCreacion;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(Integer idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUrlGithub() {
		return urlGithub;
	}
	public void setUrlGithub(String urlGithub) {
		this.urlGithub = urlGithub;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
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
