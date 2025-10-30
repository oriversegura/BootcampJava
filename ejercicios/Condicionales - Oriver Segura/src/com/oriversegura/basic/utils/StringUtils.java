package com.oriversegura.basic.utils;

public class StringUtils {

//	E6.4
//	CamelCase es una forma de escribir identificadores con más de una palabra “separándolos”
//	usando letras mayúsculas. El caso serpiente, por otro lado, usa letras minúsculas pero guiones
//	bajos para separar palabras. Escriba una función camelCaseToSnakeCase que tome una String
//	que sea un identificador válido escrito en CamelCase y la devuelva en Snake Case. Además,
//	escribe una función snakeCaseToCamelCase para la operación inversa.

	public static String snakeCaseToCamelCase(String s) {
		var builder = new StringBuilder();

		return builder.toString();

	}

	public static String camelCaseToSnakeCase(String s) {
		var builder = new StringBuilder();

		for (int letra = 0; letra < s.length(); letra++) {

			if (Character.isUpperCase(s.charAt(letra)) == true) {
				builder.append('_');

				builder.append((s.toLowerCase().charAt(letra)));

			} else {
				builder.append(s.charAt(letra));
			}

		}

		return builder.toString();
	}

}
