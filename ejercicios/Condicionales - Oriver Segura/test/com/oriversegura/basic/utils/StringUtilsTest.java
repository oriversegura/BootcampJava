package com.oriversegura.basic.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.oriversegura.basic.utils.StringUtils.*;

public class StringUtilsTest {
	
@Test
@DisplayName("")
void snakeCaseToCamelCaseTest1() {
	assertEquals("holaMundo", snakeCaseToCamelCase("hola_mundo"));
}

@Test
@DisplayName("")
void snakeCaseToCamelCaseTest2() {
	assertEquals("unoDosTres", snakeCaseToCamelCase("unoDosTres"));
}
	
@Test
@DisplayName("")
void snakeCaseToCamelCaseTest3() {
	assertEquals("identificador", snakeCaseToCamelCase("identificador"));
}

@Test
@DisplayName("")
void camelCaseToSnakeCaseTest1() {
	assertEquals("último_dígito", camelCaseToSnakeCase("últimoDígito"));
}

@Test
@DisplayName("")
void camelCaseToSnakeCaseTest2() {
	assertEquals("es_vocal", camelCaseToSnakeCase("esVocal"));	
}

}
