package com.portafolio.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estudio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEstudio;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private String estado;
	private Integer horasCursadas;
	private String establecimiento;
	private String urlImagen;
	private String urlCertificado;
	private String descripcion;
	private boolean alta;
	private Date fechaCreacion;
	public Estudio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudio(Integer idEstudio, String nombre, Date fechaInicio, Date fechaFin, String estado,
			Integer horasCursadas, String establecimiento, String urlImagen, String urlCertificado, String descripcion,
			boolean alta, Date fechaCreacion) {
		super();
		this.idEstudio = idEstudio;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
		this.horasCursadas = horasCursadas;
		this.establecimiento = establecimiento;
		this.urlImagen = urlImagen;
		this.urlCertificado = urlCertificado;
		this.descripcion = descripcion;
		this.alta = alta;
		this.fechaCreacion = fechaCreacion;
	}


	public String getUrlCertificado() {
		return urlCertificado;
	}


	public void setUrlCertificado(String urlCertificado) {
		this.urlCertificado = urlCertificado;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public Integer getIdEstudio() {
		return idEstudio;
	}
	public void setIdEstudio(Integer idEstudio) {
		this.idEstudio = idEstudio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getHorasCursadas() {
		return horasCursadas;
	}
	public void setHorasCursadas(Integer horasCursadas) {
		this.horasCursadas = horasCursadas;
	}
	public String getEstablecimiento() {
		return establecimiento;
	}
	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
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
