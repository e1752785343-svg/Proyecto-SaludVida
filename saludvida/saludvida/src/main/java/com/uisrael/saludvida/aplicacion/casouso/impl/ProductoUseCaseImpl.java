package com.uisrael.saludvida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.saludvida.aplicacion.casouso.entrada.IProductoUseCase;
import com.uisrael.saludvida.dominio.entidades.Producto;
import com.uisrael.saludvida.dominio.repositorio.IProductoRepository;

public class ProductoUseCaseImpl implements IProductoUseCase{
	
	private final IProductoRepository repository;
	
	

	public ProductoUseCaseImpl(IProductoRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Producto guardar(Producto producto) {
		// TODO Auto-generated method stub
		return repository.guardar(producto);
	}

	@Override
	public Producto buscarporId(int id) {
		// TODO Auto-generated method stub
		return repository.buscarporId(id).orElseThrow(()-> new RuntimeException("Producto no encontrado"));
	}

	@Override
	public List<Producto> listarTodos() {
		// TODO Auto-generated method stub
		return repository.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repository.eliminar(id);
	}

}
