package com.oriversegura.advance.libros;

public class Autor {
	
	private final String nombre;
	private final String apellido; 
	
	public Autor (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String nombre() {
		return this.nombre;
	}
	
	public String apellido() {
		return this.apellido;
	}
	
	public String toString() {
		return String.format("%s, %s", apellido, nombre);
	}
	
	
}
