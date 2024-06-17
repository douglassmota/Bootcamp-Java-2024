package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcular a soma dos números pares utilizando Stream API
        int somaPares = numeros.stream()
                              .filter(numero -> numero % 2 == 0)  // Filtra os números pares
                              .mapToInt(Integer::intValue)        // Converte para um stream de inteiros
                              .sum();                             // Soma todos os elementos

        // Imprimir a soma dos números pares
        System.out.println("Soma dos números pares: " + somaPares);
    }
}
