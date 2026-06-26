package com.uisrael.saludvida.dominio.repositorio;

import java.util.List;
import java.util.Optional;


import com.uisrael.saludvida.dominio.entidades.Producto;

public interface IProductoRepository {

	
	Producto guardar(Producto producto);

	Optional<Producto> buscarporId(int id);

	List<Producto> listarTodos();

	void eliminar(int id);
}
