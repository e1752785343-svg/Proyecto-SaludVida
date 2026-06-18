package com.uisrael.saludvida.dominio.entidades;

public class Usuario {

	private int idusuario;
	private String nombre;
	private String rol;
	private String Apellido;
	private String correo;
	private boolean estado;
	public Usuario(int idusuario, String nombre, String rol, String apellido, String correo, boolean estado) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.rol = rol;
		Apellido = apellido;
		this.correo = correo;
		this.estado = estado;
	}
	public Usuario() {
		
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
