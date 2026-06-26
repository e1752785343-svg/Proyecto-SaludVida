package com.uisrael.saludvida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Inventario;
import com.uisrael.saludvida.presentacion.dto.request.InventarioRequestDto;
import com.uisrael.saludvida.presentacion.dto.response.InventarioResponseDto;
@Mapper(componentModel = "spring")
public interface IInventarioDtoMapper {

	Inventario toDomain(InventarioRequestDto dto);
	
	InventarioResponseDto toResponseDto(Inventario inventario);
}
