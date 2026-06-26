package com.uisrael.saludvida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.saludvida.aplicacion.casouso.entrada.IUsuarioUseCase;
import com.uisrael.saludvida.dominio.entidades.Usuario;
import com.uisrael.saludvida.dominio.repositorio.IUsuarioRepository;

public class UsuarioUseCaseImpl implements IUsuarioUseCase{
	
	private final IUsuarioRepository repository;
	
	

	public UsuarioUseCaseImpl(IUsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		return repository.guardar(usuario);
	}

	@Override
	public Usuario buscarporId(int id) {
		// TODO Auto-generated method stub
		return repository.buscarporId(id).orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
	}

	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return repository.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repository.eliminar(id);
	}

}
