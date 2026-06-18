package com.uisrael.saludvida.dominio.entidades;

import java.util.Date;

public class Pedido {

	private int idpedido;
	private Date fechaPedido;
	private boolean estado;
	private String direccionEntrega;
	public Pedido(int idpedido, Date fechaPedido, boolean estado, String direccionEntrega) {
		super();
		this.idpedido = idpedido;
		this.fechaPedido = fechaPedido;
		this.estado = estado;
		this.direccionEntrega = direccionEntrega;
	}
	public Pedido() {
		
	}
	public int getIdpedido() {
		return idpedido;
	}
	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	
	
	
}
