package com.uisrael.saludvida.aplicacion.casouso.entrada;

import java.util.List;


import com.uisrael.saludvida.dominio.entidades.Inventario;

public interface IInventarioUseCase {
	
	Inventario guardar(Inventario inventario);

	Inventario buscarporId(int id);

	List<Inventario> listarTodos();

	void eliminar(int id);

}
