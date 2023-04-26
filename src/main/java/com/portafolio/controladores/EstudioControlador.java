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

import com.portafolio.entidades.Estudio;
import com.portafolio.servicios.EstudioServicio;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EstudioControlador {
	
	 @Autowired
	 EstudioServicio estudioServicio;
	 
	@GetMapping("/estudio")
	public List<Estudio> lista(ModelMap model) {
		List<Estudio> listaEstudio = estudioServicio.buscarTodo();
		return listaEstudio;
	}
	
	@GetMapping("/estudio/{id}")
	public Estudio lista(ModelMap model, @PathVariable Integer id) {
		 
		return estudioServicio.buscarId(id);
	}
	@PostMapping("/estudio")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudio create(@RequestBody Estudio estudio){
		
		return estudioServicio.crear(estudio);	
	}
	
	@PutMapping("estudio/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudio actualizar(@RequestBody Estudio estudio , @PathVariable Integer id) {
		
		Estudio estudioActual =estudioServicio.actualizar(estudio);
		
		return estudioActual; 
	}
	@DeleteMapping("estudio/{id}")
	public void borrar( @PathVariable Integer id) {
		
		estudioServicio.borrar(id);
		}
	

}
