package com.uisrael.saludvida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.saludvida.dominio.entidades.Farmacia;
import com.uisrael.saludvida.dominio.repositorio.IFarmaciaRepository;
import com.uisrael.saludvida.infraestructura.persistencia.jpa.FarmaciaJpa;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IFarmaciaJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IFarmaciaJpaRepository;

public class FarmaciaRepositorioImpl implements IFarmaciaRepository{
	
	private final IFarmaciaJpaRepository jparepository;
	private final IFarmaciaJpaMapper entitymapper;
	
	

	public FarmaciaRepositorioImpl(IFarmaciaJpaRepository jparepository, IFarmaciaJpaMapper entitymapper) {
		super();
		this.jparepository = jparepository;
		this.entitymapper = entitymapper;
	}

	@Override
	public Farmacia guardar(Farmacia farmacia) {
		FarmaciaJpa entity = entitymapper.toEntity(farmacia);
		FarmaciaJpa guardado = jparepository.save(entity);
		return entitymapper.toDomain(guardado);
	}

	@Override
	public Optional<Farmacia> buscarporId(int id) {
		// TODO Auto-generated method stub
		return jparepository.findById(id).map(entitymapper :: toDomain);
	}

	@Override
	public List<Farmacia> listarTodos() {
		// TODO Auto-generated method stub
		return jparepository.findAll().stream().map(entitymapper :: toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		jparepository.deleteById(id);
	}

}
