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

import com.example.ud25_4_peliculas.dto.Sala;
import com.example.ud25_4_peliculas.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;

	@GetMapping("/salas")
	public List<Sala> listarPeliculas() {
		return salaServiceImpl.listarSalas();
	}

	// Get Sala by codigo
	@GetMapping("/salas/{codigo}")
	public Sala getByCodigo(@PathVariable(name = "codigo") Long codigo) {
		return salaServiceImpl.getByCodigo(codigo);
	}

	// Get Sala by nombre
	@GetMapping("/salas/nombre/{nombre}")
	public List<Sala> listarPorNombre(@PathVariable(name = "nombre") String nombre) {
		return salaServiceImpl.listarPorNombre(nombre);
	}

	// Add Sala
	@PostMapping("/salas")
	public Sala guardarPelicula(@RequestBody Sala sala) {
		System.out.println("**************************" + sala.toString());

		return salaServiceImpl.addSala(sala);
	}

	// Update Sala
	@PutMapping("/salas/{id}")
	public Sala updatePelicula(@PathVariable(name = "id") Long id, @RequestBody Sala sala) {

		Sala sala_seleccionada = new Sala();
		Sala sala_actualizada = new Sala();

		sala_seleccionada = salaServiceImpl.getByCodigo(id);

		sala_seleccionada.setId(sala.getId());
		sala_seleccionada.setNombre(sala.getNombre());
		sala_seleccionada.setPelicula(sala.getPelicula());

		sala_actualizada = salaServiceImpl.updateSala(sala_seleccionada);
		return sala_actualizada;
	}

	// Delete Sala
	@DeleteMapping("/salas/{id}")
	public void deletePelicula(@PathVariable(name = "codigo") Long codigo) {
		salaServiceImpl.deleteSala(codigo);
	}

}
