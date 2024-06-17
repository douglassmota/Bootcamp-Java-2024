package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Ordenar a lista de números em ordem crescente e exibir no console
        numeros.stream()
        .sorted()
        .forEach(System.out::println);
    }

}
