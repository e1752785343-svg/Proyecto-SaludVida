package com.uisrael.saludvida.aplicacion.casouso.entrada;

import java.util.List;


import com.uisrael.saludvida.dominio.entidades.Usuario;

public interface IUsuarioUseCase {
	
	Usuario guardar(Usuario usuario);

	Usuario buscarporId(int id);

	List<Usuario> listarTodos();

	void eliminar(int id);

}
