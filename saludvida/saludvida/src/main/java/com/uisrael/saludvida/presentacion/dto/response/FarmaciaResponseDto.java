package com.uisrael.saludvida.presentacion.dto.response;

import lombok.Data;

@Data
public class FarmaciaResponseDto {

	private int idfarmacia;
	private String nombre;
	private String zona;
	private boolean estado;
}
