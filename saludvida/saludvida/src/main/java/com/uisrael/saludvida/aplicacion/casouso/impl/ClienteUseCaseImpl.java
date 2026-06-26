package com.uisrael.saludvida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.saludvida.aplicacion.casouso.entrada.IClienteUseCase;
import com.uisrael.saludvida.dominio.entidades.Cliente;
import com.uisrael.saludvida.dominio.repositorio.IClienteRepository;

public class ClienteUseCaseImpl implements IClienteUseCase{
	
	private final IClienteRepository repository;
	
	

	public ClienteUseCaseImpl(IClienteRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		return repository.guardar(cliente);
	}

	@Override
	public Cliente buscarporId(int id) {
		// TODO Auto-generated method stub
		return repository.buscarporId(id).orElseThrow(()-> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		return repository.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repository.eliminar(id);
	}

}
