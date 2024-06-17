package streamAPI.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 4 - Remova todos os valores ímpares:
        Consumer <Integer> imprimindoNumerosPares = numero ->{
            if(numero % 2 == 0){
                System.out.print(numero + "-");
            }   
        };
        numeros.stream().forEach(imprimindoNumerosPares);
    }

}
