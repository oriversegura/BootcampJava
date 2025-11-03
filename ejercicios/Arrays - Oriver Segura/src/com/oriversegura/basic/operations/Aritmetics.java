package com.oriversegura.basic.operations;

import java.util.Arrays;

public class Aritmetics {

//	E7.3
//	Escribe una función buscar() que dado un arreglo de ints, retorne un int que sea el índice del
//	último elemento del arreglo que sea mayor que 0 y menor que 10. Si no hay un elemento que
//	cumpla esta condición retorne -1.

	public static int buscar(int[] numeros) {

		for (int i = numeros.length - 1; i >= 0; i--) {

			if (numeros[i] > 0 && numeros[i] < 10) {
				return i;
			}

		}
		return -1;
	}

//	E7.4
//	Escribe una función operar() reciba un arreglo de ints y retorne un nuevo arreglo de ints con los
//	mismos elementos del arreglo original después de multiplicarlos por 3 y sumarles 1. Por ejemplo
//	si en el arreglo original está el elemento 2, en el arreglo retornado en esa posición debe
//	aparecer el elemento 7

	public static int[] operar(int[] datos) {
		var nuevoDatos = new int[datos.length];

		for (var i = 0; i < datos.length; i++) {

			var valorOriginal = datos[i];

			if (valorOriginal == 0) {
				nuevoDatos[i] = 0;
			} else {
				nuevoDatos[i] = valorOriginal * 3 + 1;
			}

		}

		return nuevoDatos;
	}

}
