package com.uisrael.saludvida.aplicacion.casouso.entrada;

import java.util.List;


import com.uisrael.saludvida.dominio.entidades.Cliente;

public interface IClienteUseCase {

	Cliente guardar(Cliente cliente);

	Cliente buscarporId(int id);

	List<Cliente> listarTodos();

	void eliminar(int id);

}
