package com.uisrael.saludvida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FarmaciaRequestDto {
	@NotBlank
	private int idfarmacia;
	@NotBlank
	private String nombre;
	@NotBlank
	private String zona;
	@NotBlank
	private boolean estado;
}
