package com.uisrael.saludvida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuarioRequestDto {
	@NotBlank
	private int idusuario;
	@NotBlank
	private String nombre;
	@NotBlank
	private String rol;
	@NotBlank
	private String Apellido;
	@NotBlank
	private String correo;
	@NotBlank
	private boolean estado;
}
