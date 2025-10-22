package com.oriversegura.ciclos.fechas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DateUtilsTest {

	@Test
	@DisplayName("Se espera 5 al pasar la fecha 2000-1-20")
	void numeroVidaTest1() {
		assertEquals(5, DateUtils.númeroVida(LocalDate.of(2000, 1, 20)));
	}
	
	@Test
	@DisplayName("Se espera 6 al pasar la fecha 1945-10-31")
	void numeroVidaTest2() {
		assertEquals(6, DateUtils.númeroVida(LocalDate.of(1945, 10, 31)));
	}
	
}
