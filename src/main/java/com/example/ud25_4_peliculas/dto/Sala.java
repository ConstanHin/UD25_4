package com.example.ud25_4_peliculas.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="salas")
public class Sala {
	
	// Attributes
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "pelicula_id")
	private Pelicula pelicula;
	
	
	// Constructor
	public Sala() {
	}


	public Sala(Long codigo, String nombre, Pelicula pelicula) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}


	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the pelicula
	 */
//	@JsonIgnore
	public Pelicula getPelicula() {
		return pelicula;
	}


	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	

}
