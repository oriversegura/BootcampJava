package com.oriversegura.basic.operations;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

public class AritmeticsTest {

	@Test
	@DisplayName("Retorna 2 al buscar en {5, 10, 3, 100}")
	void buscarTest1() {
		assertEquals(2, Aritmetics.buscar(new int[] { 5, 10, 3, 100 }));
	}

	@Test
	@DisplayName("Retorna -1 al buscar en {10, 10, 10}")
	void buscarTest2() {
		assertEquals(-1, Aritmetics.buscar(new int[] { 10, 10, 10 }));
	}

	@Test
	@DisplayName("Retorna {4, 7, 0} al operar sobre {1, 2, 0}")
	void operarTest1() {
		assertArrayEquals(new int[] {4, 7, 0}, Aritmetics.operar(new int[] {1, 2, 0}));

	}

	@Test
	@DisplayName("retorna {10, 13, 16} al operar sobre {3, 4, 5}")
	void operarTest2() {
		assertArrayEquals(new int[] {10, 13, 16}, Aritmetics.operar(new int[] {3, 4, 5}));
	}
	
	@Test
	@DisplayName("Devuelve 3 al pasar el arreglo {5, 1, 3} ")
	void segundoMayorTest1() {
		assertEquals(3, Aritmetics.segundoMayor(new int[] {5, 1, 3}));
	}
	
	@Test
	@DisplayName("Devuelve 7 al pasar el arreglo {-1, 7, 10, 3}")
	void segundoMayorTest2() {
		assertEquals(7, Aritmetics.segundoMayor(new int[] {-1, 7, 10, 3}));
	}
	
	


}
