package com.oriversegura.ciclos.fechas;

import java.time.LocalDate;

import com.oriversegura.ciclos.operaciones.Aritmetica;

public class DateUtils {

	public static int númeroVida(LocalDate fecha) {
		var builder = new StringBuilder();
		
		builder.append(fecha.getYear());
		builder.append(fecha.getMonthValue());
		builder.append(fecha.getDayOfMonth());
		
		var fechaNueva = builder.toString();
		
		Integer fechaEnNumeroEntero = Integer.parseInt(fechaNueva);
		
		var numeroVida = Aritmetica.dígitosSuma(fechaEnNumeroEntero);
				
		return numeroVida;
	}
	
	
}
