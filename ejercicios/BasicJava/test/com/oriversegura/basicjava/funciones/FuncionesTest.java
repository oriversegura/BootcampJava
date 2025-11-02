package com.oriversegura.basicjava.funciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FuncionesTest {
	
	
	@Test
	@DisplayName("Devuelve Hola al pasarle Ho, la a la funcion concatenar()") 
	void concatenarTest1() {
		assertEquals("Hola", Funciones.concatenar("Ho", "la"));	
		
	}
		
	

}
