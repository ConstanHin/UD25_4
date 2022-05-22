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
	
	@Column(name="calificacion_edad")
	private Integer calificacion_edad;
	
	@Column(name="codigo")
	private Integer codigo;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Sala> sala;
	
	// Constructor
	public Pelicula() {	
	}
	
	public Pelicula(Long id,Long codigo, String nombre) {
		this.id = codigo;
		this.nombre = nombre;
	}

	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCalificacion_edad() {
		return calificacion_edad;
	}

	public void setCalificacion_edad(Integer calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	



	
	
	
	
	
	
	

}
