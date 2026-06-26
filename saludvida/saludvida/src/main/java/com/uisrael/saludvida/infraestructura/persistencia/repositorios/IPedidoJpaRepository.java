package com.uisrael.saludvida.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.saludvida.infraestructura.persistencia.jpa.PedidoJpa;

public interface IPedidoJpaRepository extends JpaRepository<PedidoJpa, Integer>{

}
