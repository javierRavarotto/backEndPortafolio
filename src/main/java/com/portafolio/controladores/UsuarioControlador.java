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

import com.portafolio.entidades.Usuario;
import com.portafolio.servicios.UsuarioServicio;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@CrossOrigin(origins = {"https://portafolio-39a4d.web.app/"})
@RestController
@RequestMapping("/api")
public class UsuarioControlador {

	
	 @Autowired
	 UsuarioServicio usuarioServicio;
	 
	@GetMapping("/usuario")
	public List<Usuario> lista(ModelMap model) {
		List<Usuario> listaUsuario = usuarioServicio.buscarTodo();
		return listaUsuario;
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario buscarId(ModelMap model, @PathVariable Integer id) {
		
		return usuarioServicio.buscarId(id);
	}

	@PostMapping("usuario/login")
	public Usuario buscarNombre(ModelMap model,@RequestBody Usuario usuario) {
		Usuario usuarioNombre=usuarioServicio.buscarPorNombre(usuario);
		return usuarioNombre;
	}
	
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario){
		return usuarioServicio.crear(usuario);	
	}
	
	@PutMapping("usuario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario actualizar(@RequestBody Usuario usuario , @PathVariable Integer id) {
		
		Usuario usuarioActual =usuarioServicio.actualizar(usuario);
		
		return usuarioActual; 
	}
	@DeleteMapping("usuario/{id}")
	public void borrar( @PathVariable Integer id) {
		
		usuarioServicio.borrar(id);
		}

	
}
