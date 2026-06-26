package com.uisrael.saludvida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteRequestDto {
	@NotBlank
	private int idcliente;
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String telefeno;
	@NotBlank
	private String direccion;
	@NotBlank
	private String tipoCliente;
	@NotBlank
	private String descripcion;
	@NotBlank
	private boolean estado;
}
