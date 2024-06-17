package streamAPI.examples;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        //Criar uma lista com numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar a function com expressão lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os numeros no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .collect(Collectors.toList());

        //Imprimir a lista de numeros dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }

}
