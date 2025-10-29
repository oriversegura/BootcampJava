package com.oriversegura.basic.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.oriversegura.basic.validation.PasswordValidation.*;

public class PasswordValidationTest {

	@Test
	@DisplayName("Se espera la contraseña Abc123$_ sea fuerte")
	void contraseñaFuerteTest1() {
		assertTrue(contraseñaFuerte("Abc123$_"));
	}

	@Test
	@DisplayName("Se espera la contraseña Abc12345 no sea fuerte")
	void contraseñaFuerteTest2() {
		assertFalse(contraseñaFuerte("Abc12345"));
	}

	@Test
	@DisplayName("Se espera la contraseña abc123$_ no sea fuerte")
	void contraseñaFuerteTest3() {
		assertFalse(contraseñaFuerte("abc123$_"));
	}

	@Test
	@DisplayName("Se espera la contraseña Abcdef$_ sea fuerte")
	void contraseñaFuerteTest4() {
		assertFalse(contraseñaFuerte("Abcdef$_"));
	}

	@Test
	@DisplayName("Se espera la contraseña ABC123$_ sea fuerte")
	void contraseñaFuerteTest5() {
		assertTrue(contraseñaFuerte("ABC123$_"));
	}

}
