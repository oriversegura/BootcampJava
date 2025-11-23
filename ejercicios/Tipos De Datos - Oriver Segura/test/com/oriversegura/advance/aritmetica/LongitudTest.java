package com.oriversegura.advance.aritmetica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class LongitudTest {

    @Test
    @DisplayName("Debe retornar la medida correcta")
    void testMedida() {
        var measure = 3.14;
        assertEquals(measure, new Longitud(measure).medida(), 0.0);
    }

    @Test
    @DisplayName("Debe sumar dos longitudes inmutables")
    void testSumar() {
        var l1 = new Longitud(1.0);
        var l2 = new Longitud(2.0);
        var resultado = l1.sumar(l2);

        assertEquals(new Longitud(3.0), resultado);
        
        assertEquals(1.0, l1.medida(), 0.0);
    }

    @Test
    @DisplayName("Suma con decimales")
    void testSumarDecimales() {
        assertEquals(new Longitud(3.25), 
            new Longitud(0.75).sumar(new Longitud(2.50)));
    }
    
}