package com.portafolio.servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.portafolio.entidades.Usuario;
import com.portafolio.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {

	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	
	public Usuario buscarId(Integer id) {
		Usuario usuario = usuarioRepositorio.findById(id).get();
		return usuario;
	}
	public Usuario buscarPorNombre(Usuario usuario) {
		
			Usuario usuarioNombre = usuarioRepositorio.buscarNombre(usuario.getNombre());
			
			if(usuarioNombre.getContrasena().equals(usuario.getContrasena())) {
				return usuarioNombre;
			}else {
				Usuario usuarioNoEncontrado = new Usuario();
				return usuarioNoEncontrado;	
			}
			
			
		
		
		
	}
	
	@Transactional
	public List<Usuario> buscarTodo() {
		List<Usuario> usuario = usuarioRepositorio.findAll();
		return usuario;
	}
	
	@Transactional
	public Usuario crear(Usuario usuario) {
		if(buscarTodo().size() == 0) {
			usuario.setAdmin(true);
		}else {
			usuario.setAdmin(false);
		};
		usuario.setAlta(true);
		usuario.setFechaCreacion(new Date());
	return 	usuarioRepositorio.save(usuario);
	
	}
	@Transactional
	public Usuario actualizar(Usuario usuario) {
		
	return 	usuarioRepositorio.save(usuario);
	
	}
	@Transactional
	public void borrar( Integer id) {
		try {
			Usuario usuarioBorrar= buscarId(id);
			usuarioRepositorio.delete(usuarioBorrar);
		}catch (Exception e) {
			
		}
		
	}
}
