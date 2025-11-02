package com.oriversegura.basicjava.operadores;

public class Aritmetica {
	
	public static double tercerAngulo(double anguloA, double anguloB){
	    var grados = 180;
	    return grados - (anguloA + anguloB);
	}
	
	public static int mod(int p, int q){
	    var d = p / q;
	    var r = d * q;
	    var m = p - r;
	    return m; 
	}
	
	public static int diferenciaDeCuadrados(int a, int b){
	    var cuadradoDeA = a * a;
	    var cuadradoDeB = b * b;
	    var diferenciaDeCuadrados = cuadradoDeA - cuadradoDeB;
	    return diferenciaDeCuadrados;
	}
	
	public static boolean esPar(int n){
	    return (n % 2 == 0) ? true : false;
	}
	
	public static boolean esImpar(int n){
	    return !esPar(n);
	}
	
	public static String signo(int n){
	    return (n >= 0) ? "no negativo" : "negativo";
	}
	
	public static double leyCosenos(double a, double b, double gammaGrad){
	    var gammaRad = Math.toRadians(gammaGrad);
	    var result = Math.sqrt((a * a) + (b * b) - 2.0 * a * b * Math.cos(gammaRad));
	    return result;
	}
	
	public static boolean esTriangulo(double ladoA, double ladoB, double ladoC){
	    double ladoMasLargo = Math.max(ladoA, Math.max(ladoB, ladoC));
	    double sumaDeOtrosLados = (ladoA + ladoB + ladoC);
	    var sumaDeLadosMenores = sumaDeOtrosLados - ladoMasLargo;
	    return sumaDeLadosMenores > ladoMasLargo;
	}
	
	public static double gravedadSuperficial(double masa, double radio){
	    var G = 6.67430e-11;
	    var result = (G * masa) / Math.pow(radio, 2);
	    return result;
	}
	
	public static double gravedadSuperficialDeLaTierra(){
	    return gravedadSuperficial(5.972e24, 6.378e6);
	}
	
	public static double gravedadSuperficialMarte(){
	    return gravedadSuperficial(6.421e23, 3.3972e6);
	}
	
	public static double pesoEnMarte(double pesoEnLaTierra){
	    var pesoEnMarte = (gravedadSuperficialMarte() / gravedadSuperficialDeLaTierra()) * pesoEnLaTierra;
	    return pesoEnMarte;
	}
	
	public static double farenheitACelcius(double Farenheith){
	    var celcius = (Farenheith - 32.0) * 5.0 / 9.0;
	    return celcius;
	}
	
	public static double distanciaDosPuntos(double x1, double y1, double x2, double y2){
	    var diferenciaDeXs = x2 - x1;
	    var cuadadroDeDiferenciaXs = diferenciaDeXs * diferenciaDeXs;
	          
	    var diferenciaDeYs = y2 - y1;
	    var cuadradoDeDiferenciaYs = diferenciaDeYs * diferenciaDeYs;
	    
	    var distancia = Math.sqrt(cuadadroDeDiferenciaXs + cuadradoDeDiferenciaYs); 
	    
	    return distancia;
	    
	}
		

}
