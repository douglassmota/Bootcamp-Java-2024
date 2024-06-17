package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //Desafio 12 - Encontre o produto de todos os números da lista:
    int numeroProduto = numeros.stream()
    .reduce(1, (a, b) -> a * b);

        System.out.println("O produto dos números é: " + numeroProduto);
    }    
}
