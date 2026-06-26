package com.uisrael.saludvida.presentacion.dto.response;

import lombok.Data;

@Data
public class ProductoResponseDto {

	private int idproducto;
	private String nombre;
	private String categoria;
	private String laboratorio;
	private String fechaCaducidad;
	private float precio;
	private boolean estado;
}
