package com.uisrael.saludvida.dominio.repositorio;

import java.util.List;
import java.util.Optional;


import com.uisrael.saludvida.dominio.entidades.Usuario;

public interface IUsuarioRepository {

	Usuario guardar(Usuario usuario);

	Optional<Usuario> buscarporId(int id);

	List<Usuario> listarTodos();

	void eliminar(int id);
}
