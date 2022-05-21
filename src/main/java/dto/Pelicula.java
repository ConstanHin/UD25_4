package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula {
	
	// Attributes
	@Id
	private int codigo;
	private String nombre;
	
	// Constructor
	public Pelicula() {
		
	}
	public Pelicula(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
