package com.example.ud25_4_peliculas.service;

import java.util.List;

import com.example.ud25_4_peliculas.dto.Pelicula;


public interface IPeliculaService {

	// Listar peliculas
	public List<Pelicula> listarPeliculas();
	
	// Get by nombre
	public List<Pelicula> listarPorNombre(String nombre);
	
	// Get by codigo
	public Pelicula peliculaPorID(Long id);
	
	
	// Add
	public Pelicula addPelicula(Pelicula pelicula);
	
	// Update
	public Pelicula updatePelicula(Pelicula pelicula);
	
	// Delete
	public void deletePelicula(Long id);

}
