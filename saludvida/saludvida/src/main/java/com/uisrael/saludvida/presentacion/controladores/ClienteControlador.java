package com.uisrael.saludvida.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.saludvida.aplicacion.casouso.entrada.IClienteUseCase;
import com.uisrael.saludvida.presentacion.dto.request.ClienteRequestDto;
import com.uisrael.saludvida.presentacion.dto.response.ClienteResponseDto;
import com.uisrael.saludvida.presentacion.mapeadores.IClienteDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cliente")
public class ClienteControlador {
	
	private final IClienteUseCase clienteUseCase;
	
	private final IClienteDtoMapper mapper;

	public ClienteControlador(IClienteUseCase clienteUseCase, IClienteDtoMapper mapper) {
		super();
		this.clienteUseCase = clienteUseCase;
		this.mapper = mapper;
	}
	
	@GetMapping
	public List<ClienteResponseDto> listar(){
		
		return clienteUseCase.listarTodos().stream().map(mapper :: toResponseDto).toList();
	}
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public ClienteResponseDto crear(@Valid @RequestBody ClienteRequestDto request) {
		
		return mapper.toResponseDto(clienteUseCase.guardar(mapper.toDomain(request)));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int id){
		
		clienteUseCase.eliminar(id);
		return ResponseEntity.noContent().build();
	}
}
