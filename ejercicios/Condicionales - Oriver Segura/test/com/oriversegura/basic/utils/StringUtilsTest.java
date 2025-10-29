package com.oriversegura.basic.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.oriversegura.basic.utils.StringUtils.*;

public class StringUtilsTest {

	@Test
	@DisplayName("Se espera hola_mundo al recibir el parametro holaMundo")
	void snakeCaseToCamelCaseTest1() {
		assertEquals("holaMundo", snakeCaseToCamelCase("hola_mundo"));
	}

	@Test
	@DisplayName("Se espera unoDosTres al recibir el parametro unoDosTres")
	void snakeCaseToCamelCaseTest2() {
		assertEquals("unoDosTres", snakeCaseToCamelCase("unoDosTres"));
	}

	@Test
	@DisplayName("Se espera identificador al recibir el parametro identificador")
	void snakeCaseToCamelCaseTest3() {
		assertEquals("identificador", snakeCaseToCamelCase("identificador"));
	}

	@Test
	@DisplayName("Se espera últimoDígito al recibir el parametro último_dígito")
	void camelCaseToSnakeCaseTest1() {
		assertEquals("último_dígito", camelCaseToSnakeCase("últimoDígito"));
	}

	@Test
	@DisplayName("Se espera es_vocal al recibir el parametro esVocal")
	void camelCaseToSnakeCaseTest2() {
		assertEquals("es_vocal", camelCaseToSnakeCase("esVocal"));
	}

}
