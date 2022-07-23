package com.bootcamp.ejercicio.tema2;

/**
 * Para este ejercicio tendréis que crear una función
 * que reciba un precio y devuelva el precio con el IVA incluido.
 */
public class Main {

    public static void main(String[] args) {
        double precio = calcularIva(10);
        System.out.println(precio);
    }

    public static double calcularIva(double precio) {
        return precio * 1.21;
    }
}