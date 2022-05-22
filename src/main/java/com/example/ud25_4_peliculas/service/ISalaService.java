package com.example.ud25_4_peliculas.service;

import java.util.List;

import com.example.ud25_4_peliculas.dto.Sala;

public interface ISalaService {

	// Listar peliculas
	public List<Sala> listarSalas();

	// Get by codigo
	public Sala getByCodigo(Long codigo);
	
	// Get by nombre
	public List<Sala> listarPorNombre(String nombre);

	// Add
	public Sala addSala(Sala sala);

	// Update
	public Sala updateSala(Sala sala);

	// Delete
	public void deleteSala(Long id);
}
