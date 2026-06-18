package com.uisrael.saludvida.dominio.entidades;

public class Inventario {
	
	private int idinventario;
	private String stockActual;
	private String stockMinimo;
	private boolean estado;
	public Inventario(int idinventario, String stockActual, String stockMinimo, boolean estado) {
		super();
		this.idinventario = idinventario;
		this.stockActual = stockActual;
		this.stockMinimo = stockMinimo;
		this.estado = estado;
	}
	public Inventario() {
		
	}
	public int getIdinventario() {
		return idinventario;
	}
	public void setIdinventario(int idinventario) {
		this.idinventario = idinventario;
	}
	public String getStockActual() {
		return stockActual;
	}
	public void setStockActual(String stockActual) {
		this.stockActual = stockActual;
	}
	public String getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(String stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

}
