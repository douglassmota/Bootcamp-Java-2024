package streamAPI.examples;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

        //Criar uma lista de numeros inteiros 
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usa o CONSUMER com expressão lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        //Usar o consumer para imprimir numeros pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);
    }
}
