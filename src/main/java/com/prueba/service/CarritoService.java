package com.prueba.service;

public class CarritoService {

    // MÉTODO 1 (básico)
    public double calcularTotal(double precio, int cantidad) {
        double total = 0;

        if (cantidad > 0) {
            total = precio * cantidad;
        }

        return total;
    }

    // MÉTODO 2 (más complejo)
    public double calcularTotalConDescuento(double precio, int cantidad, double descuento) {
        double total = precio * cantidad;

        if (descuento > 0) {
            total = total - (total * descuento);
        }

        return total;
    }
}