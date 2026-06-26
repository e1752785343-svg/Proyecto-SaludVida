package com.uisrael.saludvida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.saludvida.aplicacion.casouso.entrada.IInventarioUseCase;
import com.uisrael.saludvida.dominio.entidades.Inventario;
import com.uisrael.saludvida.dominio.repositorio.IInventarioRepository;

public class InventarioUseCaseImpl implements IInventarioUseCase{
	
	private final IInventarioRepository repository;
	
	

	public InventarioUseCaseImpl(IInventarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Inventario guardar(Inventario inventario) {
		// TODO Auto-generated method stub
		return repository.guardar(inventario);
	}

	@Override
	public Inventario buscarporId(int id) {
		// TODO Auto-generated method stub
		return repository.buscarporId(id).orElseThrow(() -> new RuntimeException("Inventario no encontrado"));
	}

	@Override
	public List<Inventario> listarTodos() {
		// TODO Auto-generated method stub
		return repository.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repository.eliminar(id);
	}

}
