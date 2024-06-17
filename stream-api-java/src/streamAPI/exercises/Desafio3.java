package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
         //Desafio 3 - Verifique se todos os números da lista são positivos:
         boolean numerosPositivos = numeros.stream().allMatch(n -> n > 0);
    
        System.out.println("Todos os números são positivos? " + numerosPositivos);
    }

}
