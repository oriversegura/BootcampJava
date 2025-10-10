package com.oriversegura.basicjava.funciones;

public class Funciones {
	
	public static String concatenar(String s1, String s2){
	    return String.format("[%s+%s]", s1, s2);
	}
	
	public static String tituloAdornado(String titulo){
	    return String.format("<<< %s >>>", titulo);
	}
	
	public static String konnichiwa(String dare){
	    return String.format("こんにちは %s", dare);
	}

}
