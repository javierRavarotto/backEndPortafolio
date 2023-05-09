package com.portafolio.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portafolio.entidades.Estudio;

@Repository
public interface EstudioRepositorio extends JpaRepository <Estudio,Integer> {

}
 