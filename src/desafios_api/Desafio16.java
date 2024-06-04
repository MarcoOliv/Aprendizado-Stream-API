package desafios_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * - Desafio 16 - Agrupe os números em pares e ímpares:

Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números 
pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
 */
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer>  numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
         * List<Integer> numerosPar = numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .collect(Collectors.toList());
        
            List<Integer> numerosImpar = numeros.stream()
            .filter(numero -> numero % 2 != 0)
            .collect(Collectors.toList());
         */
            Map<Boolean, List<Integer>> numerosAgrupados = numeros.stream()
                .collect(Collectors.partitioningBy(numero -> numero % 2 == 0));

        List<Integer> numerosPar = numerosAgrupados.get(true);
        List<Integer> numerosImpar = numerosAgrupados.get(false);

    

            System.out.println(numerosPar + "\n\n " + numerosImpar);
    }
}
