package com.portafolio.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portafolio.entidades.Habilidad;

@Repository
public interface HabilidadRepositorio extends JpaRepository <Habilidad,Integer>  {

}
