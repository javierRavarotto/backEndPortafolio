package com.portafolio.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portafolio.entidades.Proyecto;

@Repository
public interface ProyectoRepositorio extends JpaRepository <Proyecto,Integer> {

}
