package com.uisrael.saludvida.dominio.entidades;

public class Producto {

	private int idproducto;
	private String nombre;
	private String categoria;
	private String laboratorio;
	private String fechaCaducidad;
	private float precio;
	private boolean estado;
	public Producto(int idproducto, String nombre, String categoria, String laboratorio, String fechaCaducidad,
			float precio, boolean estado) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.categoria = categoria;
		this.laboratorio = laboratorio;
		this.fechaCaducidad = fechaCaducidad;
		this.precio = precio;
		this.estado = estado;
	}
	public Producto() {
		
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
