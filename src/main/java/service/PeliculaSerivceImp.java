package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IPeliculaDAO;
import dto.Pelicula;

@Service
public class PeliculaSerivceImp implements IPeliculaService {
	
	@Autowired
	IPeliculaDAO iPeliculaDAO;

	@Override
	public List<Pelicula> listarPeliculas() {
		
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula peliculaPorID(Long id) {

		return iPeliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula addPelicula(Pelicula pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula updatePelicula(Pelicula pelicula) {

		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void deletePelicula(Long id) {
		iPeliculaDAO.deleteById(id);
	
	}

	@Override
	public List<Pelicula> listarPorNombre(String nombre) {
		return iPeliculaDAO.findByNombre(nombre);
		
	}


}
