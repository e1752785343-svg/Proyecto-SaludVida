package com.uisrael.saludvida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Producto;
import com.uisrael.saludvida.presentacion.dto.request.ProductoRequestDto;
import com.uisrael.saludvida.presentacion.dto.response.ProductoResponseDto;
@Mapper(componentModel = "spring")
public interface IProductoDtoMapper {

	Producto toDomain(ProductoRequestDto dto);
	
	ProductoResponseDto toResponseDto(Producto producto);
}
