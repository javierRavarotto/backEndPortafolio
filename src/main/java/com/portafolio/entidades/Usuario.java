package com.portafolio.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	private String nombre;
	private String contrasena;
	private Boolean admin;
	private Date fechaCreacion;
	private boolean alta;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Usuario(Integer idUsuario, String nombre, String contrasena, Boolean admin, Date fechaCreacion,
			boolean alta) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.admin = admin;
		this.fechaCreacion = fechaCreacion;
		this.alta = alta;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public boolean isAlta() {
		return alta;
	}
	public void setAlta(boolean alta) {
		this.alta = alta;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", contrasena=" + contrasena + ", admin="
				+ admin + ", fechaCreacion=" + fechaCreacion + ", alta=" + alta + "]";
	}
	
	
}
