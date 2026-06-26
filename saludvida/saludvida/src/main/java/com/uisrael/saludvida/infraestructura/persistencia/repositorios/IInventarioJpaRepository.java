package com.uisrael.saludvida.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.saludvida.infraestructura.persistencia.jpa.InventarioJpa;

public interface IInventarioJpaRepository extends JpaRepository<InventarioJpa, Integer>{

}
