package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 5 - Calcule a média dos números maiores que 5:
        double mediaNumeros = numeros.stream()
            .filter(numero -> numero > 5)
            .mapToInt(Integer::intValue) // Converte para um IntStream
            .average() // Calcula a média como um OptionalDouble
            .orElse(0); // Valor padrão se a lista estiver vazia

            System.out.println("Média dos números: " + mediaNumeros);
    }

}
