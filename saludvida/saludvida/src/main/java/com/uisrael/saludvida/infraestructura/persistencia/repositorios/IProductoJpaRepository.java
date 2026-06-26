package com.uisrael.saludvida.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.saludvida.infraestructura.persistencia.jpa.ProductoJpa;

public interface IProductoJpaRepository extends JpaRepository<ProductoJpa, Integer>{

}
