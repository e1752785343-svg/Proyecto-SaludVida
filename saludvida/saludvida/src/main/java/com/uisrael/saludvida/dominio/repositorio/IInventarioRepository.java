package com.uisrael.saludvida.dominio.repositorio;

import java.util.List;
import java.util.Optional;


import com.uisrael.saludvida.dominio.entidades.Inventario;

public interface IInventarioRepository {

	Inventario guardar(Inventario inventario);

	Optional<Inventario> buscarporId(int id);

	List<Inventario> listarTodos();

	void eliminar(int id);
}
