package com.uisrael.saludvida.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class FarmaciaJpa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idfarmacia;
	private String nombre;
	private String zona;
	private boolean estado;
}
