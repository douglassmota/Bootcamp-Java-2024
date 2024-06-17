package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 16 - Agrupe os números em pares e ímpares:
        System.out.println("Numeros Par");
        numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .forEach(numero -> System.out.print(numero + " - " ));
        
        System.out.println("\n");

        System.out.println("Numeros Impar");
            numeros.stream()
            .filter(numero -> numero % 2 == 1)
            .forEach(numero -> System.out.print(numero + " - "));

    }
}
