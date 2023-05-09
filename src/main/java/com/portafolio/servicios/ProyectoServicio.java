package com.portafolio.servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portafolio.entidades.Estudio;
import com.portafolio.entidades.Proyecto;
import com.portafolio.repositorios.ProyectoRepositorio;

@Service
public class ProyectoServicio {

	@Autowired
	ProyectoRepositorio proyectoRepositorio;
	
	
	public Proyecto buscarId(Integer id) {
		Proyecto proyecto = proyectoRepositorio.findById(id).get();
		return proyecto;
	}
	
	@Transactional
	public List<Proyecto> buscarTodo() {
		List<Proyecto> proyecto = proyectoRepositorio.findAll();
		return proyecto;
	}
	
	@Transactional
	public Proyecto crear(Proyecto proyecto) {
		proyecto.setAlta(true);
		proyecto.setFechaCreacion(new Date());
	return 	proyectoRepositorio.save(proyecto);
	
	}
	@Transactional
	public Proyecto actualizar(Proyecto proyecto) {
	return 	proyectoRepositorio.save(proyecto);
	
	}
	@Transactional
	public void borrar( Integer id) {
		Proyecto proyectoBorrar= buscarId(id);
		proyectoRepositorio.delete(proyectoBorrar);
	}
}
