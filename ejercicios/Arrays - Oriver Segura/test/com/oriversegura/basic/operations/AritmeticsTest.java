package com.oriversegura.basic.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AritmeticsTest {
	
	@Test
	@DisplayName("Retorna 2 al buscar en {5, 10, 3, 100}")
	void buscarTest1() {
		assertEquals(2, Aritmetics.buscar(new int[] {5, 10, 3, 100}));		
	}
	@Test
	@DisplayName("Retorna -1 al buscar en {10, 10, 10}")
	void buscarTest2() {
		assertEquals(-1, Aritmetics.buscar(new int[] {10, 10, 10}));
	}
	
	
	

	
	
	

}
