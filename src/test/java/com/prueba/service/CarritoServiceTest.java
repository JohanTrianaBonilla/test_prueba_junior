package com.prueba.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoServiceTest {

    @Test
    void deberiaCalcularTotalCorrectamente() {
        CarritoService service = new CarritoService();
        double total = service.calcularTotal(100, 2);

        assertEquals(200, total);
    }

    @Test
    void deberiaLanzarErrorSiCantidadEsCero() {
        CarritoService service = new CarritoService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.calcularTotal(100, 0);
        });
    }

    @Test
    void deberiaLanzarErrorSiPrecioEsNegativo() {
        CarritoService service = new CarritoService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.calcularTotal(-100, 2);
        });
    }

    // TESTS MÉTODO 2
    @Test
    void deberiaAplicarDescuentoCorrectamente() {
        CarritoService service = new CarritoService();
        double total = service.calcularTotalConDescuento(100, 2, 0.1);

        assertEquals(180, total);
    }

    @Test
    void noDebeAceptarDescuentoNegativo() {
        CarritoService service = new CarritoService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.calcularTotalConDescuento(100, 2, -0.1);
        });
    }
}