package com.uisrael.saludvida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Usuario;
import com.uisrael.saludvida.presentacion.dto.request.UsuarioRequestDto;
import com.uisrael.saludvida.presentacion.dto.response.UsuarioReponseDto;
@Mapper(componentModel = "spring")
public interface IUsuarioDtoMapper {

	Usuario toDomain(UsuarioRequestDto dto);
	
	UsuarioReponseDto toResponseDto(Usuario usuario);
}
