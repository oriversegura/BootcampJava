package com.oriversegura.advance.aritmetica;

public class Longitud {
	
	private final double medida;

	public Longitud(double medida) {
		this.medida = medida;
	}
	
	public double medida() {
		return this.medida;
	}
	
	public Longitud sumar(Longitud otra) {
		
		double nuevaMedidaTotal = this.medida + otra.medida();
		
		return new Longitud(nuevaMedidaTotal);
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Longitud otra && Double.compare(this.medida, otra.medida) == 0;
	}
	
	@Override
    public String toString() {
        return String.valueOf(medida);
	}
}
