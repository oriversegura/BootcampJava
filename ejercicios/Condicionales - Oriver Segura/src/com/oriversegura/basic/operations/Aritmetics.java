package com.oriversegura.basic.operations;

public class Aritmetics {

//	E6.1
//	En Matemáticas todo número entero tiene al menos 2 divisores: 1 y el propio número. Estos se
//	llaman divisores obvios. Los números primos son números mayores que 1 que no tienen ningún
//	otro divisor salvo los divisores obvios. Recuerda que si <a> es múltiplo de <b>, entonces <b>
//	es divisor de <a>. Escribe una función esPrimo para comprobar si un número es primo.

	public static boolean esPrimo(int numero) {

		if (numero <= 1) {
			return false;
		}

		for (int i = 2; i * i <= numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

}
