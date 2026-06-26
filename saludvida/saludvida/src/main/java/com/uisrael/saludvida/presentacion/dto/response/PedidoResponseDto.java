package com.uisrael.saludvida.presentacion.dto.response;

import java.util.Date;

import lombok.Data;
@Data
public class PedidoResponseDto {

	private int idpedido;
	private Date fechaPedido;
	private boolean estado;
	private String direccionEntrega;
}
