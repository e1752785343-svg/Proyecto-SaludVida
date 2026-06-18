package com.uisrael.saludvida.dominio.entidades;

public class Cliente {
	
	private int idcliente;
	private String nombre;
	private String apellido;
	private String telefeno;
	private String direccion;
	private String tipoCliente;
	private String descripcion;
	private boolean estado;
	public Cliente(int idcliente, String nombre, String apellido, String telefeno, String direccion, String tipoCliente,
			String descripcion, boolean estado) {
		super();
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefeno = telefeno;
		this.direccion = direccion;
		this.tipoCliente = tipoCliente;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public Cliente() {
		
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefeno() {
		return telefeno;
	}
	public void setTelefeno(String telefeno) {
		this.telefeno = telefeno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	

}
