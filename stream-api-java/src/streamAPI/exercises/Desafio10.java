package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        numeros.stream()
            .filter(numero -> numero % 2 != 0) // Filtra os valores ímpares
            .filter(numero -> numero % 3 == 0 || numero % 5 == 0) // Filtra os múltiplos de 3 ou 5
            .forEach(numero -> System.out.print(numero + "-")); // Imprime os valores agrupados
    }

}
