package com.oriversegura.basicjava.parqueadero;




public class Parqueadero {
	
	public static double cobro(int minutos){
	    double tarifaPorMinuto = 10.00;
	    double cobroMinimo = 100.00;
	    double cobroMaximo = 3_000.00;
	    double cobroCalculado = (double) minutos * tarifaPorMinuto;
	    return Math.min(Math.max(cobroCalculado, cobroMinimo), cobroMaximo);
	}

}
