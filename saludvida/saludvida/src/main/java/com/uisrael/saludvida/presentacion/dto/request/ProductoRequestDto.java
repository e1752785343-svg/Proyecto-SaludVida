package com.uisrael.saludvida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductoRequestDto {
	@NotBlank
	private int idproducto;
	@NotBlank
	private String nombre;
	@NotBlank
	private String categoria;
	@NotBlank
	private String laboratorio;
	@NotBlank
	private String fechaCaducidad;
	@NotBlank
	private float precio;
	@NotBlank
	private boolean estado;
}
