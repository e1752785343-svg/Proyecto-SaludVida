package com.uisrael.saludvida.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.saludvida.infraestructura.persistencia.jpa.ClienteJpa;

public interface IClienteJpaRepository extends JpaRepository<ClienteJpa, Integer>{

}
