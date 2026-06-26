package com.uisrael.saludvida.presentacion.dto.response;

import lombok.Data;

@Data
public class UsuarioReponseDto {

	private int idusuario;
	private String nombre;
	private String rol;
	private String Apellido;
	private String correo;
	private boolean estado;
}
