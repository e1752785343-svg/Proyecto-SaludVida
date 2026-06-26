package com.uisrael.saludvida.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.saludvida.infraestructura.persistencia.jpa.UsuarioJpa;

public interface IUsuarioJpaRepository extends JpaRepository<UsuarioJpa, Integer>{

}
