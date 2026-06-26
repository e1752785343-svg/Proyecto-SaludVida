package com.uisrael.saludvida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.saludvida.dominio.entidades.Usuario;
import com.uisrael.saludvida.dominio.repositorio.IUsuarioRepository;
import com.uisrael.saludvida.infraestructura.persistencia.jpa.UsuarioJpa;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IUsuarioJpaRepository;

public class UsuarioRepositorioImpl implements IUsuarioRepository{

	
	private final IUsuarioJpaRepository jparepository;
	private final IUsuarioJpaMapper entitymapper;
	
	
	public UsuarioRepositorioImpl(IUsuarioJpaRepository jparepository, IUsuarioJpaMapper entitymapper) {
		super();
		this.jparepository = jparepository;
		this.entitymapper = entitymapper;
	}

	@Override
	public Usuario guardar(Usuario usuario) {
		UsuarioJpa entity = entitymapper.toEntity(usuario);
		UsuarioJpa guardado = jparepository.save(entity);
		return entitymapper.toDomain(guardado);
	}

	@Override
	public Optional<Usuario> buscarporId(int id) {
		// TODO Auto-generated method stub
		return jparepository.findById(id).map(entitymapper :: toDomain);
	}

	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return jparepository.findAll().stream().map(entitymapper :: toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		jparepository.deleteById(id);
	}

}
