package com.oriversegura.basic.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UpcValidationTest {
	
	@Test
	@DisplayName("Se espera True al pasar el upc 116")
	void upcVálidoTest1() {
		assertTrue(UpcValidation.upcVálido("116"));
	}

	@Test
	@DisplayName("Se espera False al pasar el upc 111")
	void upcVálidoTest2() {
		assertFalse(UpcValidation.upcVálido("111"));
	}
	
	@Test
	@DisplayName("Se espera True al pasar el upc 019")
	void upcVálidoTest3() {
		assertTrue(UpcValidation.upcVálido("019"));
	}
	
	@Test
	@DisplayName("Se espera True al pasar el upc 107")
	void upcVálidoTest4() {
		assertTrue(UpcValidation.upcVálido("107"));
	}
	
	
	@Test
	@DisplayName("Se espera True al pasar el upc 240")
	void upcVálidoTest5() {
		assertTrue(UpcValidation.upcVálido("240"));
	}
	
	
	@Test
	@DisplayName("Se espera True al pasar el upc 036000241457")
	void upcVálidoTest6() {
		assertTrue(UpcValidation.upcVálido("036000241457"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
