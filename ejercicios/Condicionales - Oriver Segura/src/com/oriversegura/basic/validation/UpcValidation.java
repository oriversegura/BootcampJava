package com.oriversegura.basic.validation;

import org.hamcrest.core.SubstringMatcher;

public class UpcValidation {
	
//	E6.2
//	Los dígitos de verificación son un mecanismo simple para detectar errores cuando se digita un
//	número. Por ejemplo supongamos que generamos un identificador "123", luego aplicamos una
//	fórmula cuyo resultado es un dígito adicional, supongamos "6", entonces el identificador
//	completo sería "1236", a veces escrito como "123-6". Ahora la siguiente vez que digitemos ese
//	identificador en un sistema, este podría validarlo, separando "123" de su dígito de verificación
//	"6", calcular el número de verificación de "123" y revisar que coincide con el "6" obtenido. Esto
//	significa que si una persona se equivoca al digitar el número, por ejemplo intercambiando 2
//	dígitos de lugar, el número de verificación no coincidirá y así se sabrá que hubo un error al
//	126
//	digitarlo. Para los números UPC (Universal Product Code) el algoritmo para hallar el dígito de
//	verificación es:
//	● Separa el último dígito que es el número de verificación.
//	● Suma los dígitos en posiciones impares (el primer dígito, el tercer dígito, etc) y el
//	resultado multiplícalo por 3.
//	● Suma los dígitos en posiciones pares (el segundo dígito, el cuarto dígito, etc)
//	● Suma los resultados de los dos pasos anteriores
//	● Encuentra el módulo 10 de la suma, llamémoslo M
//	● Si M es 0, ese es el número de verificación. Si no es 0, entonces el dígito de verificación
//	es 10 - M
//	Crea una función que reciba un número dado como una cadena y verifique si es un número
//	UPC válido verificando el dígito de verificación como se explica en las reglas anteriores.
	
	public static boolean upcVálido(String upc) {
		
		
		
		
		
		
		
		
		
		return true;
	}

}
