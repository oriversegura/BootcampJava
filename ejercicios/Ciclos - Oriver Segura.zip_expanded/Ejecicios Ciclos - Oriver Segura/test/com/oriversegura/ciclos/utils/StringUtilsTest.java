package com.oriversegura.ciclos.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	// Ejercicio E5.1

	@Test
	@DisplayName("Se espera avaJ al pasarle la palabra Java")
	void reversarTest1() {
		assertEquals("avaJ", StringUtils.reversar("Java"));

	}

	@Test
	@DisplayName("Se espera nuf si avaJ al pasarle la frase Java is fun")
	void reversarTest2() {
		assertEquals("nuf si avaJ", StringUtils.reversar("Java is fun"));
	}

	// Ejercicio E5.2

	@Test
	@DisplayName("Se espera 2 al contar abr en abracadabra")
	void conteoTest1() {
		assertEquals(2, StringUtils.conteo("abracadabra", "abr"));
	}

	@Test
	@DisplayName("Se espera 4 al contar 01 en 110101110101100")
	void conteoTest2() {
		assertEquals(4, StringUtils.conteo("110101110101100", "01"));
	}

	@Test
	@DisplayName("Se espera 3 al contar x en xoxox")
	void conteoTest3() {
		assertEquals(3, StringUtils.conteo("xoxox", "x"));
	}

	@Test
	@DisplayName("Se espera 1 al contar ss en sssa")
	void conteoTest4() {
		assertEquals(1, StringUtils.conteo("sssa", "ss"));

	}

	// Ejercicio E5.3

	@Test
	@DisplayName("Se espera 1 al pasarle la palabra one")
	void cuentaPalabrasTest1() {
		assertEquals(1, StringUtils.cuentaPalabras("one"));
	}

	@Test
	@DisplayName("Se espera 3 al pasarle la frase one two three")
	void cuentaPalabrasTest2() {
		assertEquals(3, StringUtils.cuentaPalabras("one two three"));
	}

	// Ejercicio E5.7

	@Test
	@DisplayName("Se espera 0 al pasar el parametro ABC")
	void cerosInicialesTest1() {
		assertEquals(0, StringUtils.cerosIniciales("ABC"));
	}

	@Test
	@DisplayName("Se espera 2 al pasar el parametro 00ABC")
	void cerosInicialesTest2() {
		assertEquals(2, StringUtils.cerosIniciales("00ABC"));

	}

	@Test
	@DisplayName("Se espera 1 al pasar el parametro 0ABC00")
	void cerosInicialesTest3() {
		assertEquals(1, StringUtils.cerosIniciales("0ABC00"));
	}

}
