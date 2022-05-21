package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Long> {
	
	// Buscar por el nombre
	public List<Pelicula> findByNombre(String nombre);
	
}
