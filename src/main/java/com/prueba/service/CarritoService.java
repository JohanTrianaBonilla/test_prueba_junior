package com.prueba.service;

public class CarritoService {

    // MÉTODO 1 (básico)
    public  double calcularTotal(double precio, int cantidad) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }

        return precio * cantidad;
    }

    // MéTODO 2 (más complejo)
    public  double calcularTotalConDescuento(double precio, int cantidad, double descuento) {
        if (descuento < 0.0) {
            throw new IllegalArgumentException("El descuento no puede ser negativo");
        }

        double total = calcularTotal(precio, cantidad);

        if (descuento > 0.0) {
            total = total - (total * descuento);
        }

        return total;
    }
}
