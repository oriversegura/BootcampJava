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
	@DisplayName("Retorna 0 al pasar el arreglo {a, b, c}")
	void másLargoTest2() {
		assertEquals(0, StringUtils.másLargo(new String[] { "a", "b", "c" }));
	}
	
	
	@Test
	@DisplayName("Retorna true al buscar b en {a, b, c}")
	void contieneTest1(){
		assertEquals(true, StringUtils.contiene(new String[] {"a", "b", "c"}, "b"));
	}
	
	@Test
	@DisplayName("Retorna false al buscar 1 en {a, b, c}")
	void contieneTest2() {
	assertEquals(false, StringUtils.contiene(new String[] {"a", "b", "c"}, "1"));
	}
}
