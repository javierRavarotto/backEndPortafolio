package com.portafolio.servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portafolio.entidades.Habilidad;
import com.portafolio.repositorios.HabilidadRepositorio;

@Service
public class HabilidadServicio {
	
	@Autowired
	HabilidadRepositorio habilidadRepositorio;
	
	public Habilidad buscarId(Integer id) {
		Habilidad habilidad = habilidadRepositorio.findById(id).get();
		return habilidad;
	}
	@Transactional
	public List<Habilidad> buscarTodo() {
		List<Habilidad> habilidad = habilidadRepositorio.findAll();
		return habilidad;
	}
	
	@Transactional
	public Habilidad crear(Habilidad habilidad) {
		habilidad.setAlta(true);
		habilidad.setFechaCreacion(new Date());
	return 	habilidadRepositorio.save(habilidad);
	
	}
	@Transactional
	public Habilidad actualizar(Habilidad habilidad) {
		
	return 	habilidadRepositorio.save(habilidad);
	
	}
	@Transactional
	public void borrar( Integer id) {
		Habilidad habilidadBorrar= buscarId(id);
		habilidadRepositorio.delete(habilidadBorrar);
	}

}
