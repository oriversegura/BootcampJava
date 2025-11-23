package com.oriversegura.advance.libros;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AutorTest {
	
	@Test
	@DisplayName("Creacion de autor John Doe")
	void testCreacionAutor1() {
		var nombre = "John";
		var apellido = "Doe";
		var johnDoe = new Autor(nombre, apellido);
		assertAll(
		() -> assertEquals(nombre, johnDoe.nombre()),
		() -> assertEquals(apellido, johnDoe.apellido()),
		() -> assertEquals("Doe, John", johnDoe.toString())
		);

	}
	
	@Test
	@DisplayName("Creacion de autora Jane Roe")
	void testCreacionAutor2() {
		var nombre = "Jane";
		var apellido = "Roe";
		var janeRoe = new Autor(nombre, apellido);

		assertEquals(nombre, janeRoe.nombre());

		assertEquals(apellido, janeRoe.apellido());

		assertEquals("Roe, Jane", janeRoe.toString());
	}
}
