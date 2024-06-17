package streamAPI.examples;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        //É usada para realizar operações de redução em pares de elementos, como somar numeros ou combinar objetos.
        //Crie uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar o BinaryOperator com expressão lambda para somar dois numeros inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //Usar o BinaryOperator para somar todos os numeros no Stream
        int resultado = numeros.stream()
        .reduce(0,somar);

        //Imprimir o resultado da soma
        System.out.println("A soma dos numeros é: " + resultado);
    }


}
