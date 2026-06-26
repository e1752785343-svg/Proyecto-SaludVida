package com.uisrael.saludvida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;


import com.uisrael.saludvida.dominio.entidades.Producto;
import com.uisrael.saludvida.infraestructura.persistencia.jpa.ProductoJpa;

@Mapper(componentModel = "spring")
public interface IProductoJpaMapper {
	
	Producto toDomain(ProductoJpa entity);

	ProductoJpa toEntity(Producto producto);

}
