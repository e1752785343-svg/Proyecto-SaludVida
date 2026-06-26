package com.uisrael.saludvida.aplicacion.casouso.entrada;

import java.util.List;


import com.uisrael.saludvida.dominio.entidades.Pedido;

public interface IPedidoUseCase {

	Pedido guardar(Pedido pedido);

	Pedido buscarporId(int id);

	List<Pedido> listarTodos();

	void eliminar(int id);
}
