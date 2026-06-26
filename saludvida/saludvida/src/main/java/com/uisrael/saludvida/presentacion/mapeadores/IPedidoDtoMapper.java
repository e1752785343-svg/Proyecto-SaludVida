package com.uisrael.saludvida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Pedido;
import com.uisrael.saludvida.presentacion.dto.request.PedidoRequestDto;
import com.uisrael.saludvida.presentacion.dto.response.PedidoResponseDto;
@Mapper( componentModel = "spring")
public interface IPedidoDtoMapper {

	Pedido toDomain(PedidoRequestDto dto);
	
	PedidoResponseDto toResponseDto(Pedido pedido);
}
