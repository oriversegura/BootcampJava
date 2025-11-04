package com.oriversegura.basic.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayValidationTest {
	
	@Test
	@DisplayName("Devuelve true al pasar el arreglo {5, 1, 3}")
	void únicoTest1() {
		assertEquals(true, ArrayValidation.únicos(new int[] {5, 1, 3}));
	}
	
	@Test
	@DisplayName("Devuelve false al pasar el arreglo {-1, 7, -1, 3}")
	void únicoTest2() {
		assertEquals(false, ArrayValidation.únicos(new int[] {-1, 7, -1, 3}));

	}
	
	
	

}
