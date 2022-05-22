package com.example.ud25_4_peliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud25_4_peliculas.dao.IPeliculaDAO;
import com.example.ud25_4_peliculas.dto.Pelicula;

@Service
public class PeliculaSerivceImp implements IPeliculaService {
	
	@Autowired
	IPeliculaDAO iPeliculaDAO;

	@Override
	public List<Pelicula> listarPeliculas() {
		
		return iPeliculaDAO.findAll();
	}
	
	@Override
	public Pelicula peliculaPorCodigo(Long codigo) {
		
		return iPeliculaDAO.findByCodigo(codigo);
	}

	@Override
	public Pelicula savePelicula(Pelicula pelicula) {
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
