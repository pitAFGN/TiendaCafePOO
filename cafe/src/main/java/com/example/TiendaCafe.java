package com.example;

public class TiendaCafe {
    public static void main(String[] args) {

        Cafe producto1 = new Cafe("colcafe", "Antioquia", 50000,5 );
        producto1.mostrarInformacion();
        producto1.calcularPrecioTotal();
        producto1.actualizarCantidad(500000);
    }
}
