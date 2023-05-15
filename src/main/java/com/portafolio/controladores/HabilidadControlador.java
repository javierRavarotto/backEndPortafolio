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

import com.portafolio.entidades.Habilidad;
import com.portafolio.servicios.HabilidadServicio;


@CrossOrigin(origins = {"https://portafolio-39a4d.web.app/"})
@RestController
@RequestMapping("/api")
public class HabilidadControlador {
	
	@Autowired
	HabilidadServicio habilidadServicio;
	
	@GetMapping("/habilidad")
	public List<Habilidad> lista(ModelMap model) {
		List<Habilidad> listahabilidad = habilidadServicio.buscarTodo();
		return listahabilidad;
	}
	

	@GetMapping("/habilidad/{id}")
	public Habilidad lista(ModelMap model, @PathVariable Integer id) {
		 
		return habilidadServicio.buscarId(id );
	}
	

	@PostMapping("/habilidad")
	@ResponseStatus(HttpStatus.CREATED)
	public Habilidad create(@RequestBody Habilidad habilidad){
		System.out.print("anda");
		return habilidadServicio.crear(habilidad);	
	}
	
	@PutMapping("habilidad/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Habilidad actualizar(@RequestBody Habilidad habilidad , @PathVariable Integer id) {
		
		Habilidad habilidadActual =habilidadServicio.actualizar(habilidad);
		
		return habilidadActual; 
	}
	@DeleteMapping("habilidad/{id}")
	public void borrar( @PathVariable Integer id) {
		
		habilidadServicio.borrar(id);
		}
	

}
