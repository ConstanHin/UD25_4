package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.Pelicula;
import service.PeliculaSerivceImp;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaSerivceImp peliculaSerivceImp;

	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas() {
		return peliculaSerivceImp.listarPeliculas();
	}

	// Get pelicula by codigo
	@GetMapping("/peliculas/{id}")
	public Pelicula getByID(@PathVariable(name = "id") Long id ) {
		return peliculaSerivceImp.peliculaPorID(id);
	}
	
	// Get peliculas by nombre
	@GetMapping("/peliculas/{nombre}")
	public List<Pelicula> listarPorNombre(@PathVariable(name = "nombre") String nombre) {
		return peliculaSerivceImp.listarPorNombre(nombre);
	}
	
	// Add Pelicula
	@PostMapping("/peliculas")
	public Pelicula addPelicula(Pelicula pelicula) {
		return peliculaSerivceImp.addPelicula(pelicula);
	}
	
	// Update pelicula
	@PutMapping("/peliculas/{id}")
	public Pelicula updatePelicula(@PathVariable(name ="id")Long id ,@RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionada = new Pelicula();
		Pelicula pelicula_actualizada = new Pelicula();
		
		pelicula_seleccionada = peliculaSerivceImp.peliculaPorID(id);
		
		pelicula_seleccionada.setCodigo(pelicula.getCodigo());
		pelicula_seleccionada.setNombre(pelicula.getNombre());
		
		pelicula_actualizada = peliculaSerivceImp.updatePelicula(pelicula_seleccionada); 
		return pelicula_actualizada;
	}
	
	//Delete pelicula
	public void deletePelicula(@PathVariable(name ="id")Long id) {
		peliculaSerivceImp.deletePelicula(id);
	}

}
