package com.uisrael.saludvida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.saludvida.dominio.entidades.Cliente;

public interface IClienteRepository {

	
	Cliente guardar(Cliente cliente);
	
	Optional<Cliente> buscarporId(int id);
	
	List<Cliente> listarTodos();
	
	void eliminar(int id);
}
