package com.oriversegura.basic.validation;

import java.util.Arrays;

public class ArrayValidation {

//	E7.5
//	Escribe una función que retorne verdadero si todos los elementos de un arreglo de ints son
//	únicos y falso si hay al menos un elemento repetido.

	public static boolean únicos(int[] numeros) {

		for (int i = 0; i < numeros.length - 1; i++) {

			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[i] == numeros[j]) {
					return false;
				}
			}
		}
		return true;

	}

}
