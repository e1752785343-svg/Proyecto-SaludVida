package com.uisrael.saludvida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.saludvida.dominio.entidades.Farmacia;
import com.uisrael.saludvida.presentacion.dto.request.FarmaciaRequestDto;
import com.uisrael.saludvida.presentacion.dto.response.FarmaciaResponseDto;

@Mapper(componentModel = "spring")
public interface IFarmaciaDtoMapper {

	Farmacia toDomain(FarmaciaRequestDto dto);

	FarmaciaResponseDto toResponseDto(Farmacia farmacia);
}
