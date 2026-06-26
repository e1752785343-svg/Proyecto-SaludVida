package com.uisrael.saludvida.aplicacion.casouso.entrada;

import java.util.List;


import com.uisrael.saludvida.dominio.entidades.Producto;

public interface IProductoUseCase {
	
	Producto guardar(Producto producto);

	Producto buscarporId(int id);

	List<Producto> listarTodos();

	void eliminar(int id);

}
