package com.portafolio.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.portafolio.entidades.Proyecto;
import com.portafolio.servicios.ProyectoServicio;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProyectoControlador {
	
	 @Autowired
	 ProyectoServicio proyectoServicio;
	 
	@GetMapping("/proyecto")
	public List<Proyecto> lista(ModelMap model) {
		List<Proyecto> listaProyecto = proyectoServicio.buscarTodo();
		return listaProyecto;
	}
	
	@GetMapping("/proyecto/{id}")
	public Proyecto lista(ModelMap model, @PathVariable Integer id) {
		 
		return proyectoServicio.buscarId(id);
	}
	
	@PostMapping("/proyecto")
	@ResponseStatus(HttpStatus.CREATED)
	public Proyecto create(@RequestBody Proyecto proyecto){
		return proyectoServicio.crear(proyecto);	
	}
	
	@PutMapping("proyecto/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Proyecto actualizar(@RequestBody Proyecto proyecto) {
		Proyecto proyectoActual =proyectoServicio.actualizar(proyecto);
		
		return proyectoActual; 
	}
	@DeleteMapping("proyecto/{id}")
	public void borrar( @PathVariable Integer id) {
		proyectoServicio.borrar(id);
		}

}
