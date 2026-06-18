package com.uisrael.saludvida.infraestructura.persistencia.jpa;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class PedidoJpa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpedido;
	private Date fechaPedido;
	private boolean estado;
	private String direccionEntrega;
}
