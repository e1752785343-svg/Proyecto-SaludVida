package com.uisrael.saludvida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Inventario;
import com.uisrael.saludvida.infraestructura.persistencia.jpa.InventarioJpa;

@Mapper(componentModel = "spring")
public interface IInventarioJpaMapper {

	Inventario toDomain(InventarioJpa entity);

	InventarioJpa toEntity(Inventario inventario);
}
