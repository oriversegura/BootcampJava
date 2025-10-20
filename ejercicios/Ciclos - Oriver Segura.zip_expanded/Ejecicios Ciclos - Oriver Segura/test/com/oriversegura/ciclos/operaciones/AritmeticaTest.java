package com.oriversegura.ciclos.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AritmeticaTest {

	// Ejercicio E5.4

	@Test
	@DisplayName("Se espera 75 al pasar los parametros 10 y 15")
	void sumaRangoNúmeroTest1() {
		assertEquals(75, Aritmetica.sumaRangoNúmero(10, 15));
	}

	@Test
	@DisplayName("Se espera 15 al pasar los parametros 1 y 5")
	void sumaRangoNúmeroTest2() {
		assertEquals(15, Aritmetica.sumaRangoNúmero(1, 5));
	}

	// Ejercicio E5.5
	@Test
	@DisplayName("se espera 1 al pasar el parametro 1234")
	void dígitoSumaTest1() {
		assertEquals(1, Aritmetica.dígitosSuma(1234));
	}

	@Test
	@DisplayName("Se espera 6 al pasar el parametro 555")
	void dígitoSumaTest2() {
		assertEquals(6, Aritmetica.dígitosSuma(555));
	}

	// Ejercicio E5.6

	@Test
	@DisplayName("Se espera 1.0 al pasar el parametro 1")
	void serieArmónicaTest1() {
		assertEquals(1.0, Aritmetica.serieArmónica(1));
	}

	@Test
	@DisplayName("Se espera 1.5 al pasar el parametro 2")
	void serieArmónicaTest2() {
		assertEquals(1.5, Aritmetica.serieArmónica(2));
	}

	@Test
	@DisplayName("Se espera 2.0833 al pasar el parametro 4 con un rango de concordancia de 4 decimales.")
	void serieArmónicaTest3() {
		assertEquals(2.0833, Aritmetica.serieArmónica(4), 1e-4);
	}

}
