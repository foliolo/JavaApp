package com.bootcamp.ejercicio.tema678;

import java.util.Vector;

/**
 * Dada la función:
 * public static String reverse(String texto) { }
 * <p>
 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
 * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
 * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
 * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 * Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
public class Main {

    public static void main(String[] args) {

        reverseText();

        unidimensionalArray();

        bidimensionalArray();

        vectorAddRemove();

        // ETC
    }

    /**
     * Escribe el código que devuelva una cadena al revés
     */
    private static void reverseText() {
        String texto = "hola mundo";
        System.out.println(reverse(texto));
    }

    public static String reverse(String texto) {
        return new StringBuilder(texto).reverse().toString();

//        // Reverse string with for loop
//        String reversedString = "";
//        for (int i = texto.length() - 1; i >= 0; i--) {
//            reversedString += texto.charAt(i);
//        }
//        return reversedString;
    }

    /**
     * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores
     */
    private static void unidimensionalArray() {
        String[] array = {"hola", "mundo", "hola", "mundo", "hola", "mundo"};
        for (String s : array) {
            System.out.print(s + " ");
        }
    }

    /**
     * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones
     */
    private static void bidimensionalArray() {
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array2.length; ++i) {
            for (int j = 0; j < array2[i].length; ++j) {
                System.out.print("[" + (i - 1) + "]" + "[" + j + "]: " + array2[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
     */
    private static void vectorAddRemove() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.removeIf(x -> x == 2 || x == 3);
        System.out.println("Vector: " + vector);
    }
}