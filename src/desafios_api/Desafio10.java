package desafios_api;

import java.util.Arrays;
import java.util.List;
/*
 * - Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:

Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 */
import java.util.stream.Collectors;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multiplosde3e5 = numeros.stream()
            .filter(numero -> (numero % 3 == 0 || numero % 5 == 0) && numero % 2 != 0) 
            .collect(Collectors.toList());

        System.out.println(multiplosde3e5);
    }
}
