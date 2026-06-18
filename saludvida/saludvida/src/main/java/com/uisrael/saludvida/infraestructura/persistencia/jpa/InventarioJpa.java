package com.uisrael.saludvida.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class InventarioJpa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idinventario;
	private String stockActual;
	private String stockMinimo;
	private boolean estado;

}
