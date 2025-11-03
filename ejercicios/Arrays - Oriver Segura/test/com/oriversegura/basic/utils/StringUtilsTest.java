package com.oriversegura.basic.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	@Test
	@DisplayName("Retorna 1 al pasar el arreglo {abc, casa, cc}")
	void másLargoTest1() {
		assertEquals(1, StringUtils.másLargo(new String[] { "abc", "casa", "cc" }));
	}

	@Test
	@DisplayName("Retorna 1 al pasar el arreglo {abc, casa, cc}")
	void másLargoTest2() {
		assertEquals(0, StringUtils.másLargo(new String[] { "a", "b", "c" }));
	}

}
