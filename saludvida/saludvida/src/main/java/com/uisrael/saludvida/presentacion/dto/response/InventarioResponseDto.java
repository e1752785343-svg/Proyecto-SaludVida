package com.uisrael.saludvida.presentacion.dto.response;

import lombok.Data;

@Data
public class InventarioResponseDto {

	private int idinventario;
	private String stockActual;
	private String stockMinimo;
	private boolean estado;
}
