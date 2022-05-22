package com.example.ud25_4_peliculas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ud25_4_peliculas.dto.Sala;

public interface ISalaDAO extends JpaRepository<Sala, Long> {

	// Buscar por el nombre
	public List<Sala> findByNombre(String nombre);
	
}
