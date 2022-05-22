package com.example.ud25_4_peliculas.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="salas")
public class Sala {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	@Column
	private Long id;
	@Column(name="nombre")
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "pelicula_id")
	private Pelicula pelicula;
	
	
	// Constructor
	public Sala() {
	}

	public Sala(Long codigo, String nombre, Pelicula pelicula) {
		this.id = codigo;
		this.nombre = nombre;
		this.pelicula = pelicula;
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
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Sala [codigo=" + id + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}
	
	
	

}
