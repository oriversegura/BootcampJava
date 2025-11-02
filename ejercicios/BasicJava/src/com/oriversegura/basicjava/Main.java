package com.oriversegura.basicjava;

import com.oriversegura.basicjava.parqueadero.Parqueadero;

import com.oriversegura.basicjava.operadores.*;

import com.oriversegura.basicjava.funciones.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Parqueadero.cobro(150)); 
		
		System.out.println(Funciones.tituloAdornado("Java"));
		
		System.out.println(Funciones.konnichiwa("Oriver"));
		
		System.out.println(Aritmetica.tercerAngulo(10.0, 12.0));
		
	}

}
