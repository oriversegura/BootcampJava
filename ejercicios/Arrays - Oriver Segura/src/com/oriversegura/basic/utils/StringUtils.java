package com.oriversegura.basic.utils;



public class StringUtils {

//	E7.1
//	Escribe una función másLargo(), que reciba un arreglo de String y devuelva el índice del String
//	con mayor cantidad de caracteres. En caso de haber más de uno con la misma cantidad de
//	caracteres devuelve el que tenga el menor índice

	public static int másLargo(String[] data) {
		var indiceMasLargo = 0;
		var longitudMaxima = data[0].length();

		for (var i = 1; i < data.length; i++) {
			var longitudActual = data[i].length();
			
			if (longitudActual > longitudMaxima) {
				longitudMaxima = longitudActual;
				indiceMasLargo = i;
			}

		}
		return indiceMasLargo;
	}
	
	
//	E7.2
//	Escribe una función contiene() que dado un arreglo de String y un String, retorne verdadero si
//	ese String está en el arreglo y falso en caso contrario.
	
	public static boolean contiene(String[] arreglo, String patron) {
		
		for(int i = 0; i < arreglo.length; i++){
			if (arreglo[i] == patron)
				return true;
			
		}
		return false;
	}
	
	
	
}
