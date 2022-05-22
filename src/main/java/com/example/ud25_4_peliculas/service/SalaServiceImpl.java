package com.example.ud25_4_peliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud25_4_peliculas.dao.ISalaDAO;
import com.example.ud25_4_peliculas.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	ISalaDAO iSalaDAO;
	
	
	// Get by codigo
	@Override
	public Sala getByCodigo(Long codigo) {
		return iSalaDAO.findById(codigo).get();
	}

	@Override
	public List<Sala> listarSalas() {
		return iSalaDAO.findAll();
	}

	@Override
	public List<Sala> listarPorNombre(String nombre) {
		return iSalaDAO.findByNombre(nombre);
	}

	@Override
	public Sala addSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala updateSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public void deleteSala(Long id) {
		iSalaDAO.deleteById(id);
	}


}
