package com.oriversegura.ciclos.utils;

public class PatternGenerator {

	// Ejercicio 5.9

	public static String patronAjedrez(int tamaño) {
		var builder = new StringBuilder();

		for (int fila = 1; fila <= tamaño; fila++) {

			for (int columna = 1; columna <= tamaño; columna++) {

				var sumaEsPar = (fila + columna) % 2 == 0;

				var caracter = sumaEsPar ? '*' : '.';

				builder.append(caracter);
			}

			builder.append("\n");
		}

		return builder.toString();
	}

	// Ejercicio 5.10

	public static String coordenadas(int rango) {
		var builder = new StringBuilder();

		for (int i = 1; i <= rango; i++) {

			for (int j = 1; j <= rango; j++) {

				builder.append('|').append('(').append(i).append(", ").append(j).append(')');

			}
		}

		builder.append('|');

		return builder.toString();

	}

}
