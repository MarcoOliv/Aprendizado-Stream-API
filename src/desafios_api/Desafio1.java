package desafios_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/*
 - Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */

public class Desafio1 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      
        Consumer<Integer> imprimirNumero = numero -> {
          Collections.sort(numeros);
          System.out.println(numero);
        };

        numeros.stream()
          .forEach(imprimirNumero);
    }
}
