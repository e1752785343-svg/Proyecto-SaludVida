package com.uisrael.saludvida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.saludvida.dominio.entidades.Producto;
import com.uisrael.saludvida.dominio.repositorio.IProductoRepository;
import com.uisrael.saludvida.infraestructura.persistencia.jpa.ProductoJpa;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IProductoJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IProductoJpaRepository;

public class ProductoRepositorioImpl implements IProductoRepository{
	
	private final IProductoJpaRepository jparepository;
	private final IProductoJpaMapper entitymapper;
	
	

	public ProductoRepositorioImpl(IProductoJpaRepository jparepository, IProductoJpaMapper entitymapper) {
		super();
		this.jparepository = jparepository;
		this.entitymapper = entitymapper;
	}

	@Override
	public Producto guardar(Producto producto) {
		ProductoJpa entity = entitymapper.toEntity(producto);
		ProductoJpa guardado = jparepository.save(entity);
		return entitymapper.toDomain(guardado);
	}

	@Override
	public Optional<Producto> buscarporId(int id) {
		// TODO Auto-generated method stub
		return jparepository.findById(id).map(entitymapper :: toDomain);
	}

	@Override
	public List<Producto> listarTodos() {
		// TODO Auto-generated method stub
		return jparepository.findAll().stream().map(entitymapper :: toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		jparepository.deleteById(id);
	}

}
