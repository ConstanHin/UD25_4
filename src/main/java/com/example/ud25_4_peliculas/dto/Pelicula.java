package com.example.ud25_4_peliculas.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="peliculas")
public class Pelicula {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String nombre;
    @OneToMany
    @JoinColumn(name="id")
    private List<Sala> sala;
	
	// Constructor
	public Pelicula() {
		
	}
	public Pelicula(Long codigo, String nombre) {
		this.id = codigo;
		this.nombre = nombre;
	}
	public Long getCodigo() {
		return id;
	}
	public void setCodigo(Long codigo) {
		this.id = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sala")
	public List<Sala> getSalas() {
		return sala;
	}
	public void setSalas(List<Sala> sala) {
		this.sala = sala;
	}
	
	
	
	
	

}
