package com.oriversegura.advance.inventario;

public class UPC {
	
	private final String numero;
	
	public UPC(String numero) {
		this.numero = numero;
	}
	
	public String numero() {
		return this.numero;
	}

	private boolean upcVálido(String upc) {
		var sumaDigitoImpar = 0;
		var sumaDigitoPar = 0;
		var ultimoDigito = upc.charAt(upc.length() - 1);

		for (int indice = 0; indice < upc.length() - 1; indice++) {
			char c = upc.charAt(indice);
			if (indice % 2 == 0) {
				sumaDigitoImpar += Character.getNumericValue(c);
			} else {
				sumaDigitoPar += Character.getNumericValue(c);
			}
		}

		var sumaTotal = (sumaDigitoImpar * 3) + sumaDigitoPar;

		var modulo = sumaTotal % 10;

		var digitoVerificacion = 0;

		if (modulo == 0) {
			digitoVerificacion = 0;
		} else {
			digitoVerificacion = 10 - modulo;
		}

		return digitoVerificacion == Character.getNumericValue(ultimoDigito);

	}
	
	public String numero(String numero) {
		upcVálido(numero);
		return numero();
	}
	
	
	
}
