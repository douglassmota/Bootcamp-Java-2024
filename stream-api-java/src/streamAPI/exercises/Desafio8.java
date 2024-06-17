package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {

    public static void main(String[] args) {

        List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
            .map(n -> n.toString())           // Converte cada número para string
            .flatMapToInt(s -> s.chars()) // Converte cada string em um stream de caracteres
            .map(c -> Character.getNumericValue(c)) // Converte cada caractere de volta para seu valor numérico
            .sum(); // Soma todos os dígitos

            System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDosDigitos); 
    }
}
