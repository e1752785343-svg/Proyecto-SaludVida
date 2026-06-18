package com.uisrael.saludvida.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class ClienteJpa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;
	private String nombre;
	private String apellido;
	private String telefeno;
	private String direccion;
	private String tipoCliente;
	private String descripcion;
	private boolean estado;

}
