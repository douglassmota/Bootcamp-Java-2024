package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(4,4,4,4,4,4);

        //Desafio 18 - Verifique se todos os números da lista são iguais:
        boolean numerosIguais = numeros.stream().distinct().count() == 1;
        System.out.println("Os números da lista são iguais? " + numerosIguais);
    
    }

}
