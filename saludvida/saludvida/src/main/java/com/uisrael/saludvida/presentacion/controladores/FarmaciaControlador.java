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

import com.uisrael.saludvida.aplicacion.casouso.entrada.IFarmaciaUseCase;
import com.uisrael.saludvida.presentacion.dto.request.FarmaciaRequestDto;
import com.uisrael.saludvida.presentacion.dto.response.FarmaciaResponseDto;
import com.uisrael.saludvida.presentacion.mapeadores.IFarmaciaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/farmacia")
public class FarmaciaControlador {

	private final IFarmaciaUseCase farmaciaUseCase;
	private final IFarmaciaDtoMapper mapper;
	public FarmaciaControlador(IFarmaciaUseCase farmaciaUseCase, IFarmaciaDtoMapper mapper) {
		super();
		this.farmaciaUseCase = farmaciaUseCase;
		this.mapper = mapper;
	}
	
	@GetMapping
	public List<FarmaciaResponseDto> listar(){
		
		return farmaciaUseCase.listarTodos().stream().map(mapper :: toResponseDto).toList();
	}
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public FarmaciaResponseDto crear(@Valid @RequestBody FarmaciaRequestDto request) {
		
		return mapper.toResponseDto(farmaciaUseCase.guardar(mapper.toDomain(request)));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int id){
		
		farmaciaUseCase.eliminar(id);
		return ResponseEntity.noContent().build();
	}
}
