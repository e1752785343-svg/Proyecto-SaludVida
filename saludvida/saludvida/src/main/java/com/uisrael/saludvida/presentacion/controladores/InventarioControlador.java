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

import com.uisrael.saludvida.aplicacion.casouso.entrada.IInventarioUseCase;
import com.uisrael.saludvida.presentacion.dto.request.InventarioRequestDto;
import com.uisrael.saludvida.presentacion.dto.response.InventarioResponseDto;
import com.uisrael.saludvida.presentacion.mapeadores.IInventarioDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/inventario")
public class InventarioControlador {
	
	private final IInventarioUseCase inventarioUseCase;
	
	private final IInventarioDtoMapper mapper;

	public InventarioControlador(IInventarioUseCase inventarioUseCase, IInventarioDtoMapper mapper) {
		super();
		this.inventarioUseCase = inventarioUseCase;
		this.mapper = mapper;
	}
	
	@GetMapping
	public List<InventarioResponseDto> listar(){
		
		return inventarioUseCase.listarTodos().stream().map(mapper :: toResponseDto).toList();
	}
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public InventarioResponseDto crear(@Valid @RequestBody InventarioRequestDto request) {
		
		return mapper.toResponseDto(inventarioUseCase.guardar(mapper.toDomain(request)));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int id){
		
		inventarioUseCase.eliminar(id);
		return ResponseEntity.noContent().build();
	}

}
