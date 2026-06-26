package com.uisrael.saludvida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.saludvida.aplicacion.casouso.entrada.IPedidoUseCase;
import com.uisrael.saludvida.dominio.entidades.Pedido;
import com.uisrael.saludvida.dominio.repositorio.IPedidoRepository;

public class PedidoUseCaseImpl implements IPedidoUseCase{
	
	private final IPedidoRepository repository;
	
	

	public PedidoUseCaseImpl(IPedidoRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Pedido guardar(Pedido pedido) {
		// TODO Auto-generated method stub
		return repository.guardar(pedido);
	}

	@Override
	public Pedido buscarporId(int id) {
		// TODO Auto-generated method stub
		return repository.buscarporId(id).orElseThrow(()-> new RuntimeException("Pedido no encontrado"));
	}

	@Override
	public List<Pedido> listarTodos() {
		// TODO Auto-generated method stub
		return repository.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repository.eliminar(id);
	}

}
