package com.uisrael.saludvida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.saludvida.dominio.entidades.Pedido;
import com.uisrael.saludvida.dominio.repositorio.IPedidoRepository;
import com.uisrael.saludvida.infraestructura.persistencia.jpa.PedidoJpa;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IPedidoJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IPedidoJpaRepository;

public class PedidoRepositorioImpl implements IPedidoRepository{
	
	private final IPedidoJpaRepository jparepository;
	private final IPedidoJpaMapper entitymapper;
	
	

	public PedidoRepositorioImpl(IPedidoJpaRepository jparepository, IPedidoJpaMapper entitymapper) {
		super();
		this.jparepository = jparepository;
		this.entitymapper = entitymapper;
	}

	@Override
	public Pedido guardar(Pedido pedido) {
		PedidoJpa entity = entitymapper.toEntity(pedido);
		PedidoJpa guardado = jparepository.save(entity);
		return entitymapper.toDomain(guardado);
	}

	@Override
	public Optional<Pedido> buscarporId(int id) {
		// TODO Auto-generated method stub
		return jparepository.findById(id).map(entitymapper :: toDomain);
	}

	@Override
	public List<Pedido> listarTodos() {
		// TODO Auto-generated method stub
		return jparepository.findAll().stream().map(entitymapper :: toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		jparepository.deleteById(id);
	}

}
