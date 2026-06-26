package com.uisrael.saludvida.presentacion.dto.request;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class PedidoRequestDto {
	@NotBlank
	private int idpedido;
	@NotBlank
	private Date fechaPedido;
	@NotBlank
	private boolean estado;
	@NotBlank
	private String direccionEntrega;
}
