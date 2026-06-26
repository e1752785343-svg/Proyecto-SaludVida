package com.uisrael.saludvida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Pedido;
import com.uisrael.saludvida.infraestructura.persistencia.jpa.PedidoJpa;

@Mapper(componentModel = "spring")
public interface IPedidoJpaMapper {

	Pedido toDomain(PedidoJpa entity);

	PedidoJpa toEntity(Pedido pedido);
}
