package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {

    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 6 - Verificar se a lista contém algum número maior que 10:
        boolean temNumeroMaiorDez = numeros.stream().anyMatch(numero -> numero > 10);

        if (temNumeroMaiorDez) {
            System.out.println("A lista contém números maiores que 10.");
        } else {
            System.out.println("A lista não contém números maiores que 10.");
        }
    }

}
