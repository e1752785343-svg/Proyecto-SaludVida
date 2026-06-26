package com.uisrael.saludvida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.saludvida.dominio.entidades.Farmacia;

public interface IFarmaciaUseCase {
	
	Farmacia guardar(Farmacia farmacia);

	Farmacia buscarporId(int id);

	List<Farmacia> listarTodos();

	void eliminar(int id);


}
