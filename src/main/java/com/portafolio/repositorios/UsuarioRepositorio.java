package com.portafolio.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.portafolio.entidades.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository <Usuario,Integer>  {
	@Query(value="SELECT u FROM Usuario u WHERE u.nombre LIKE :nombre ")
	public Usuario buscarNombre(@Param("nombre") String nombre);
}
