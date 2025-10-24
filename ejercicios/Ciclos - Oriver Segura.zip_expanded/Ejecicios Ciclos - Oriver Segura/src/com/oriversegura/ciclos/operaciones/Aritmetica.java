package com.oriversegura.ciclos.operaciones;

public class Aritmetica {

	// Ejercicio E5.4
	public static int sumaRangoNúmero(int numeroUno, int numeroDos) {

		var sumatoria = 0;

		for (int i = numeroUno; i <= numeroDos; i++) {

			sumatoria += i;
		}

		return sumatoria;
	}

	// Ejercicio E5.5
	public static int dígitosSuma(int numeros) {

		while (numeros >= 10) {

			numeros = sumaDígitos(numeros);
		}

		return numeros;
	}

	private static int sumaDígitos(int n) {
		var suma = 0;
		while (n > 0) {
			var últimoDígito = n % 10;
			suma += últimoDígito;
			n /= 10;
		}
		return suma;
	}
	
	//Ejercicio E5.6
	
	public static double serieArmónica(int numero) {
		var suma = 0.0;
		
		for (int i = 1; i <= numero; i++) {
			 
			suma += 1.0 / (double) i;	
			
		}
		return suma; 
	}

}
