package com.uisrael.saludvida.presentacion.dto.response;

import lombok.Data;

@Data
public class ClienteResponseDto {

	private int idcliente;
	private String nombre;
	private String apellido;
	private String telefeno;
	private String direccion;
	private String tipoCliente;
	private String descripcion;
	private boolean estado;
}
