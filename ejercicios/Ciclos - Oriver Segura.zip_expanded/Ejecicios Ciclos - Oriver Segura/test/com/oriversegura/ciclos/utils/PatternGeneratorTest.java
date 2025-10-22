package com.oriversegura.ciclos.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PatternGeneratorTest {

	// Ejercicio 5.9
	@Test
	@DisplayName("Devuelve el patron que se ve en el test al recibir el parametro 3")
	void patronAjedrezTest1() {
		assertEquals("""
				*.*
				.*.
				*.*
				""", PatternGenerator.patronAjedrez(3));
	}

	@Test
	@DisplayName("Devuelve el patron que se ve en el test al recibir el parametro 6")
	void patronAjedrezTest2() {
		assertEquals("""
				*.*.*.
				.*.*.*
				*.*.*.
				.*.*.*
				*.*.*.
				.*.*.*
				""", PatternGenerator.patronAjedrez(6));
	}

	@Test
	@DisplayName("Devuelve el patron esperado al recibir el parametro 2")
	void coordenadasTest1() {
		assertEquals("|(1, 1)|(1, 2)|(2, 1)|(2, 2)|", PatternGenerator.coordenadas(2));

	}

	@Test
	@DisplayName("Devuelve el patron esperado al recibir el parametro 3")
	void coordenadasTest2() {
		assertEquals("|(1, 1)|(1, 2)|(1, 3)|(2, 1)|(2, 2)|(2, 3)|(3, 1)|(3, 2)|(3, 3)|", PatternGenerator.coordenadas(3));

	}
}
