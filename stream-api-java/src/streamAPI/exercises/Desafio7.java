package streamAPI.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio7 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 7 - Encontrar o segundo número maior da lista:
        int segundoMaiornumero = numeros.stream()
        .sorted(Comparator.reverseOrder())  //Ordena em ordem decrescente
        .skip(1) // Pula o primeiro (maior) número
        .findFirst() // Obtém o segundo maior número
        .orElseThrow(() -> new IllegalArgumentException("A lista deve conter pelo menos dois números diferentes"));
        
        System.out.println("O segundo maior numero é: "+ segundoMaiornumero);
    }
}
