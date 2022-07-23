package com.bootcamp.ejercicio.tema3;

/**
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 * String[] nombres = {"", "", "", ""}
 */
public class Main {

    public static void main(String[] args) {
        String[] words = {"Hola,", "voy", "a", "entrega", "el", "ejercicio"};

        for (String text : words) {
            System.out.print(text + " ");
        }
    }
}