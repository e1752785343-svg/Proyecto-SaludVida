package com.uisrael.saludvida.dominio.repositorio;

import java.util.List;
import java.util.Optional;


import com.uisrael.saludvida.dominio.entidades.Farmacia;

public interface IFarmaciaRepository {

	Farmacia guardar(Farmacia farmacia);

	Optional<Farmacia> buscarporId(int id);

	List<Farmacia> listarTodos();

	void eliminar(int id);

}
