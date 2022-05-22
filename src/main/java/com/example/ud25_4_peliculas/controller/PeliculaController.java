package com.example.ud25_4_peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ud25_4_peliculas.dto.Pelicula;
import com.example.ud25_4_peliculas.service.PeliculaSerivceImp;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaSerivceImp peliculaSerivceImp;

	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas() {
		return peliculaSerivceImp.listarPeliculas();
	}
	
	// Get peliculas by codigo
	@GetMapping("/peliculas/{codigo}")
	public Pelicula listarPorNombre(@PathVariable(name = "codigo") Long codigo) {
		return peliculaSerivceImp.peliculaPorCodigo(codigo);
	}
	
	// Get peliculas by nombre
	@GetMapping("/peliculas/nombre/{nombre}")
	public List<Pelicula> listarPorNombre(@PathVariable(name = "nombre") String nombre) {
		return peliculaSerivceImp.listarPorNombre(nombre);
	}
	
	// Add Pelicula
	@PostMapping("/peliculas")
	public Pelicula addPelicula(@RequestBody Pelicula pelicula) {
		return peliculaSerivceImp.savePelicula(pelicula);
	}
	
	// Update pelicula
	@PutMapping("/peliculas/{codigo}")
	public Pelicula updatePelicula(@PathVariable(name ="codigo")Long codigo ,@RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionada = new Pelicula();
		Pelicula pelicula_actualizada = new Pelicula();
		
		pelicula_seleccionada = peliculaSerivceImp.peliculaPorCodigo(codigo);
		
		pelicula_seleccionada.setNombre(pelicula.getNombre());
		pelicula_seleccionada.setCalificacion_edad(pelicula.getCalificacion_edad());
		
		pelicula_actualizada = peliculaSerivceImp.updatePelicula(pelicula_seleccionada); 
		return pelicula_actualizada;
	}
	
	//Delete pelicula
	@DeleteMapping("/peliculas/{codigo}")
	public void deletePelicula(@PathVariable(name ="codigo")Long codigo) {
		peliculaSerivceImp.deletePelicula(codigo);
	}

}
