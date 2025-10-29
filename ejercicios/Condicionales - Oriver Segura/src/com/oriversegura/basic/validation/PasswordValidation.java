package com.oriversegura.basic.validation;

public class PasswordValidation {

//	E6.3
//	Escribe una función contraseñaFuerte que tome un String y devuelva verdadero solo si una
//	contraseña cumple con los siguientes criterios:
//	● Tener al menos una letra mayúscula
//	● Tener al menos un número
//	● Tener al menos un carácter no alfanumérico
//	● Tener al menos 8 caracteres.

	public static boolean contraseñaFuerte(String contraseña) {

		var tieneMayuscula = false;
		var tieneNumero = false;
		var tieneAlfanumerico = false;

		for (int i = 0; i < contraseña.length(); i++) {

			if (Character.isUpperCase(contraseña.charAt(i))) {
				tieneMayuscula = true;
			}

			if (Character.isDigit(contraseña.charAt(i))) {
				tieneNumero = true;
			}

			if (!Character.isLetterOrDigit(contraseña.charAt(i))) {
				tieneAlfanumerico = true;
			}

		}

		return tieneMayuscula && tieneNumero && tieneAlfanumerico && (contraseña.length() >= 8);
	}

}
