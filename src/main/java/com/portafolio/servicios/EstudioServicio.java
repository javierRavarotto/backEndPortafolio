package com.portafolio.servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portafolio.entidades.Estudio;
import com.portafolio.entidades.Habilidad;
import com.portafolio.repositorios.EstudioRepositorio;

@Service
public class EstudioServicio {
	@Autowired
	EstudioRepositorio estudioRepositorio;
	

	public Estudio buscarId(Integer id) {
		Estudio estudio = estudioRepositorio.findById(id).get();
		return estudio;
	}
	
	@Transactional
	public List<Estudio> buscarTodo() {
		List<Estudio> estudios = estudioRepositorio.findAll();
		return estudios;
	}
	
	@Transactional
	public Estudio crear(Estudio estudio) {
		estudio.setAlta(true);
		estudio.setFechaCreacion(new Date());
	return 	estudioRepositorio.save(estudio);
	
	}
	@Transactional
	public Estudio actualizar(Estudio estudio) {
		
	return 	estudioRepositorio.save(estudio);
	
	}
	@Transactional
	public void borrar( Integer id) {
		Estudio estudioBorrar= buscarId(id);
		estudioRepositorio.delete(estudioBorrar);
	}
	
}
