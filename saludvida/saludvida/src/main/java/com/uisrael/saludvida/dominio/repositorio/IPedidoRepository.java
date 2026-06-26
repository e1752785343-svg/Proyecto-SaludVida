package com.uisrael.saludvida.dominio.repositorio;

import java.util.List;
import java.util.Optional;


import com.uisrael.saludvida.dominio.entidades.Pedido;

public interface IPedidoRepository {

	Pedido guardar(Pedido pedido);

	Optional<Pedido> buscarporId(int id);

	List<Pedido> listarTodos();

	void eliminar(int id);
}
