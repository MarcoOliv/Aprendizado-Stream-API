package desafios_api;
/*
 * - Desafio 6 - Verificar se a lista contém algum número maior que 10:

Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

 */

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verificarMaiorQue10 = numeros.stream()
            .anyMatch(numero -> numero>10);
        

        System.out.println("Possui numero maior que 10: " + verificarMaiorQue10);
    }
}
