package com.uisrael.saludvida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Usuario;
import com.uisrael.saludvida.infraestructura.persistencia.jpa.UsuarioJpa;

@Mapper(componentModel = "spring")
public interface IUsuarioJpaMapper {
	
	Usuario toDomain(UsuarioJpa entity);

	UsuarioJpa toEntity(Usuario Usuario);

}
