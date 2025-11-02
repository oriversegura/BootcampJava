package com.oriversegura.basicjava.strings;

public class UtilStrings {
	
	public static String domingoDePascua(int año){
	    var a = año % 19;
	var b = año / 100;
	var c = año % 100;
	var d = b / 4;
	var e = b % 4;
	var g = ((8 * b) + 13) / 25;
	var h = ((19 * a) + b - d - g + 15) % 30;
	var i = c / 4;
	var k = c % 4;
	var l = (32 + (2 * e) + (2 * i) - h - k) % 7;
	var m = (a + (11 * h) + (19 * l)) / 433;
	// n es el número del mes, 3 = marzo, 4 = abril
	var n = (h + l - (7 * m) + 90) / 25;
	// p es el día del mes
	var p = (h + l - (7 * m) + (33 * n) + 19) % 32;
	    return String.format("%04d/%02d/%02d", año, n, p);
	}
	
	public static String hexString(int r, int g, int b){
	    return String.format("%02X%02X%02X", r, g, b);
	}
	
	public static String dominio(String url){
	    var protocolo = url.substring(8);
	    var barra = protocolo.indexOf('/');
	    return barra != -1 ? protocolo.substring(0, barra) : protocolo;
	}
	
	public static String extension(String ruta){
	    var punto = ruta.lastIndexOf(".");
	    var barra = Math.max(ruta.lastIndexOf("/"), ruta.lastIndexOf("//"));
	    return punto > barra && punto != -1 ? ruta.substring(punto + 1) : "";
	}
	
	public static boolean esPalindrome(String palindrome){
		   var firstChar = palindrome.toLowerCase().charAt(0);
		    var lastChar = palindrome.toLowerCase().charAt(palindrome.length() - 1);
		    return firstChar == lastChar;
	}
	
	public static boolean empiezaConMinúscula(String s) {
		return Character.isLowerCase(s.charAt(0));
	}
	
	public static boolean terminaEnS(String texto) {
		var últimoCaracter = texto.charAt(texto.length() - 1);
		return (últimoCaracter == 's') || (últimoCaracter == 'S');
	}
	
	public static String titleCase(String texto) {
		var primeraLetra = texto.substring(0, 1);
		var restoDelTexto = texto.substring(1);
		return String.format("%S%s", primeraLetra, restoDelTexto.toLowerCase());
	}
	
	public static boolean esVocal(char letra) {
		var letraMinúscula = Character.toLowerCase(letra);
		return "aeiou".contains(Character.toString(letraMinúscula));
	}
	
	public static String pluralizar(int conteo, String s) {
		return (conteo < 2) ? s : String.format("%d %ss", conteo, s);
	}
	
	
}
