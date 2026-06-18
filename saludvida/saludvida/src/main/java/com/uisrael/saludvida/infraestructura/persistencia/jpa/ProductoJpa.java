package com.uisrael.saludvida.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ProductoJpa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;
	private String nombre;
	private String categoria;
	private String laboratorio;
	private String fechaCaducidad;
	private float precio;
	private boolean estado;

}
