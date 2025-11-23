package com.oriversegura.advance.inventario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class UPCTest {

    @Test
    @DisplayName("Calcula correctamente el dígito de verificación para caso 1")
    void testCaso1() {
        var numeroBase = "03600024145";
        var numeroEsperado = "036000241457"; 
        assertEquals(numeroEsperado, new UPC(numeroBase).numero());
    }

    @Test
    @DisplayName("Calcula correctamente el dígito de verificación para caso 2")
    void testCaso2() {
        var numeroBase = "12345678901";
        var numeroEsperado = "123456789012";
        assertEquals(numeroEsperado, new UPC(numeroBase).numero());
    }
}
