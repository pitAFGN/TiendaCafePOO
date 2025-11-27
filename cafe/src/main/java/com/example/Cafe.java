package com.example;

public class Cafe {

     String nombre;
     String region;
     float precioPorKilo;
     float cantidadEnKilos;

    public Cafe(String nombre, String region, float precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    public void  calcularPrecioTotal() {
        float precioTotal = precioPorKilo * cantidadEnKilos;
        System.out.println("El precio total al multiplicar el precio por la cantidad es: " + precioTotal);
    }

    public void mostrarInformacion() {
        System.out.println("nombre del producto: " + nombre);
        System.out.println("nombre de la region originaria: " + region);
        System.out.println("precio por kilo: " + precioPorKilo);
        System.out.println("cantidad en kilos: " + cantidadEnKilos);
    }
    
    public void actualizarCantidad(float cantidadActualizada) {
        this.cantidadEnKilos = cantidadActualizada;
        System.out.println("la cantidad actualizada seria: " + cantidadEnKilos);
    }
    
}
