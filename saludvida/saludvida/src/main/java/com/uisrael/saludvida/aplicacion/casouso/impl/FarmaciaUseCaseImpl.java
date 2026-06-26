package com.uisrael.saludvida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.saludvida.aplicacion.casouso.entrada.IFarmaciaUseCase;
import com.uisrael.saludvida.dominio.entidades.Farmacia;
import com.uisrael.saludvida.dominio.repositorio.IFarmaciaRepository;

public class FarmaciaUseCaseImpl implements IFarmaciaUseCase{
	
	private final IFarmaciaRepository repository;
	
	

	public FarmaciaUseCaseImpl(IFarmaciaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Farmacia guardar(Farmacia farmacia) {
		// TODO Auto-generated method stub
		return repository.guardar(farmacia);
	}

	@Override
	public Farmacia buscarporId(int id) {
		// TODO Auto-generated method stub
		return repository.buscarporId(id).orElseThrow(()-> new RuntimeException("Farmacia no encontrada"));
	}

	@Override
	public List<Farmacia> listarTodos() {
		// TODO Auto-generated method stub
		return repository.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repository.eliminar(id);
	}

}
