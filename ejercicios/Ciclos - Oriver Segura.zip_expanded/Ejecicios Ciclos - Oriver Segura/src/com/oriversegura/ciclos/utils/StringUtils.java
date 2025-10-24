package com.oriversegura.ciclos.utils;


public class StringUtils {

	// Ejercicio E5.1
	public static String reversar(String palabra) {
		var builder = new StringBuilder();

		for (var i = palabra.length() - 1; i >= 0; i--) {
			builder.append(palabra.charAt(i));
		}
		return builder.toString();

	}

	// Ejercicio E5.2
	public static int conteo(String cadena, String subCadena) {
		var contador = 0;

		var indiceBusquedaInicio = 0;

		var posicionEncontrada = 0;

		while ((posicionEncontrada = cadena.indexOf(subCadena, indiceBusquedaInicio)) != -1) {
			contador++;

			indiceBusquedaInicio = posicionEncontrada + subCadena.length();

		}

		return contador;

	}

	// Ejercicio E5.3
	public static int cuentaPalabras(String palabra) {

		return conteo(palabra, " ") + 1;
	}

	// Ejercicio E5.7
	
	
	public static int caracteresIniciales(String id, char c) {
		var indice = 0;


		while (indice < id.length() && id.charAt(indice) == c) {
			indice++;
		}
		return indice;

	}

	public static int cerosIniciales(String id) {
		return caracteresIniciales(id, '0');

	}

}
