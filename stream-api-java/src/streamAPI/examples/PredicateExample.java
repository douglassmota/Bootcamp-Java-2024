package streamAPI.examples;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        //É comumente usada para filtrar os elementos do Stream com base em alguma condição
    //Criar uma lista de plavras
    List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");

    //Criar um Predicate que verifica se a palavra tem mais de 5 Caracteres
    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    //Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida
    //imprimir cada palavra que passou no filtro
    palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(System.out::println);
        
    }
}
