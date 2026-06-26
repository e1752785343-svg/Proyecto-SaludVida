package com.uisrael.saludvida.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.saludvida.aplicacion.casouso.entrada.IClienteUseCase;
import com.uisrael.saludvida.aplicacion.casouso.entrada.IFarmaciaUseCase;
import com.uisrael.saludvida.aplicacion.casouso.entrada.IInventarioUseCase;
import com.uisrael.saludvida.aplicacion.casouso.entrada.IPedidoUseCase;
import com.uisrael.saludvida.aplicacion.casouso.entrada.IProductoUseCase;
import com.uisrael.saludvida.aplicacion.casouso.entrada.IUsuarioUseCase;
import com.uisrael.saludvida.aplicacion.casouso.impl.ClienteUseCaseImpl;
import com.uisrael.saludvida.aplicacion.casouso.impl.FarmaciaUseCaseImpl;
import com.uisrael.saludvida.aplicacion.casouso.impl.InventarioUseCaseImpl;
import com.uisrael.saludvida.aplicacion.casouso.impl.PedidoUseCaseImpl;
import com.uisrael.saludvida.aplicacion.casouso.impl.ProductoUseCaseImpl;
import com.uisrael.saludvida.aplicacion.casouso.impl.UsuarioUseCaseImpl;
import com.uisrael.saludvida.dominio.repositorio.IClienteRepository;
import com.uisrael.saludvida.dominio.repositorio.IFarmaciaRepository;
import com.uisrael.saludvida.dominio.repositorio.IInventarioRepository;
import com.uisrael.saludvida.dominio.repositorio.IPedidoRepository;
import com.uisrael.saludvida.dominio.repositorio.IProductoRepository;
import com.uisrael.saludvida.dominio.repositorio.IUsuarioRepository;
import com.uisrael.saludvida.infraestructura.persistencia.adaptadores.ClienteRepositorioImpl;
import com.uisrael.saludvida.infraestructura.persistencia.adaptadores.FarmaciaRepositorioImpl;
import com.uisrael.saludvida.infraestructura.persistencia.adaptadores.InventarioRepositorioImpl;
import com.uisrael.saludvida.infraestructura.persistencia.adaptadores.PedidoRepositorioImpl;
import com.uisrael.saludvida.infraestructura.persistencia.adaptadores.ProductoRepositorioImpl;
import com.uisrael.saludvida.infraestructura.persistencia.adaptadores.UsuarioRepositorioImpl;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IFarmaciaJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IInventarioJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IPedidoJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IProductoJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IClienteJpaRepository;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IFarmaciaJpaRepository;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IInventarioJpaRepository;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IPedidoJpaRepository;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IProductoJpaRepository;
import com.uisrael.saludvida.infraestructura.persistencia.repositorios.IUsuarioJpaRepository;

@Configuration
public class SaludVidaConfiguracion {
	@Bean
	IClienteUseCase clienteUseCase(IClienteRepository repositorio) {
		return new ClienteUseCaseImpl(repositorio);
	}
	@Bean
	IClienteRepository clienteRepositorio(IClienteJpaRepository jpaRepository, IClienteJpaMapper mapper) {
		return new ClienteRepositorioImpl(jpaRepository, mapper);
	}
	@Bean
	IFarmaciaUseCase farmaciaUseCase(IFarmaciaRepository repositorio) {
		return new FarmaciaUseCaseImpl(repositorio);
	}
	@Bean
	IFarmaciaRepository farmaciaRepositorio(IFarmaciaJpaRepository jpaRepository, IFarmaciaJpaMapper mapper) {
		return new FarmaciaRepositorioImpl(jpaRepository, mapper);
	}
	@Bean
	IInventarioUseCase inventarioUseCase(IInventarioRepository repositorio) {
		return new InventarioUseCaseImpl(repositorio);
	}
	@Bean
	IInventarioRepository inventarioRepositorio(IInventarioJpaRepository jpaRepository, IInventarioJpaMapper mapper) {
		return new InventarioRepositorioImpl(jpaRepository, mapper);
	}
	@Bean
	IPedidoUseCase pedidoUseCase(IPedidoRepository repositorio) {
		return new PedidoUseCaseImpl(repositorio);
	}
	@Bean
	IPedidoRepository pedidoRepositorio(IPedidoJpaRepository jpaRepository, IPedidoJpaMapper mapper) {
		return new PedidoRepositorioImpl(jpaRepository, mapper);
	}
	@Bean
	IProductoUseCase productoUseCase(IProductoRepository repositorio) {
		return new ProductoUseCaseImpl(repositorio);
	}
	@Bean
	IProductoRepository productoRepositorio(IProductoJpaRepository jpaRepository, IProductoJpaMapper mapper) {
		return new ProductoRepositorioImpl(jpaRepository, mapper);
	}
	@Bean
	IUsuarioUseCase usuarioUseCase(IUsuarioRepository repositorio) {
		return new UsuarioUseCaseImpl(repositorio);
	}
	@Bean
	IUsuarioRepository usuarioRepositorio(IUsuarioJpaRepository jpaRepository, IUsuarioJpaMapper mapper) {
		return new UsuarioRepositorioImpl(jpaRepository, mapper);
	}
	
}
