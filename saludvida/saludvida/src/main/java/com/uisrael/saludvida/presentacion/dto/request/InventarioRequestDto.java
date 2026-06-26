package com.uisrael.saludvida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class InventarioRequestDto {
	@NotBlank
	private int idinventario;
	@NotBlank
	private String stockActual;
	@NotBlank
	private String stockMinimo;
	@NotBlank
	private boolean estado;
}
