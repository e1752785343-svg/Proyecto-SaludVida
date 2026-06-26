package com.uisrael.saludvida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Cliente;
import com.uisrael.saludvida.presentacion.dto.request.ClienteRequestDto;
import com.uisrael.saludvida.presentacion.dto.response.ClienteResponseDto;
@Mapper(componentModel = "spring")
public interface IClienteDtoMapper {

	Cliente toDomain(ClienteRequestDto dto);
	
	ClienteResponseDto toResponseDto(Cliente cliente);
}
