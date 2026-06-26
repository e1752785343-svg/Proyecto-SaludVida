package com.uisrael.saludvida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Cliente;
import com.uisrael.saludvida.infraestructura.persistencia.jpa.ClienteJpa;
@Mapper(componentModel = "spring")
public interface IClienteJpaMapper {

	Cliente toDomain(ClienteJpa entity);
	
	ClienteJpa toEntity(Cliente cliente);
}
