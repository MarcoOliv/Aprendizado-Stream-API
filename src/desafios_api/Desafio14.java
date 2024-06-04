package desafios_api;

import java.util.Arrays;
import java.util.List;

/*
 * - Desafio 14 - Encontre o maior número primo da lista:

Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorPrimo = numeros.stream()
        .filter(Desafio14::ehPrimo)
        .max(Integer::compareTo)
        .orElse(-1); // Retorna -1 se não houver nenhum número primo na lista

    System.out.println("Maior número primo: " + maiorPrimo);
}

// Função para verificar se um número é primo
private static boolean ehPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}
}