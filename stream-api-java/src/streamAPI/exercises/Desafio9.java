package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        boolean numeroRepetido = numeros.stream().distinct().count() != numeros.size();

        if (numeroRepetido) {
            System.out.println("A lista contém números repetidos");
        } else {
            System.out.println("A lista não contém números repetidos");
        }
    }

}
