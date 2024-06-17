package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 14 - Encontre o maior número primo da lista:
        Optional<Integer> maiorNumeroPrimo = numeros.stream()
            .filter(Desafio14::isPrime)
            .max(Integer::compare);

        maiorNumeroPrimo.ifPresent(System.out::println);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
