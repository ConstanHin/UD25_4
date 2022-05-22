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
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="calificacion_edad")
	private Integer calificacion_edad;
	
    @OneToMany
    @JoinColumn(name="codigo")
    private List<Sala> sala;
	
	// Constructor
	public Pelicula() {	
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param calificacion_edad
	 * @param sala
	 */
	public Pelicula(Long codigo, String nombre, Integer calificacion_edad, List<Sala> sala) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
		this.sala = sala;
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
	 * @return the calificacion_edad
	 */
	public Integer getCalificacion_edad() {
		return calificacion_edad;
	}

	/**
	 * @param calificacion_edad the calificacion_edad to set
	 */
	public void setCalificacion_edad(Integer calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}

	/**
	 * @return the sala
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacion_edad=" + calificacion_edad
				+ ", sala=" + sala + "]";
	}

	

	

	



	
	
	
	
	
	
	

}
