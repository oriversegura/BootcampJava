package com.oriversegura.basic.operations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AritmeticsTest {

	@Test
	@DisplayName("Se espera False al validar el numero 1")
	void esPrimoTest1() {
		assertFalse(Aritmetics.esPrimo(1));
	}

	@Test
	@DisplayName("Se espera True al validar el numero 7")
	void esPrimoTest2() {
		assertTrue(Aritmetics.esPrimo(7));
	}

	@Test
	@DisplayName("Se espera False al validar el numero 100")
	void esPrimoTest3() {
		assertFalse(Aritmetics.esPrimo(100));
	}

}
