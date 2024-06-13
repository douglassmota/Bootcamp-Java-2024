package map.basic;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributos
    private Map<String,String> palavrasMap;

    //constructor
    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }else{
            System.out.println("Dicionario vazio");
        }
    }

    public void exibirPalavras(){
        System.out.println(palavrasMap);
    }
    
    public String pesquisarPorPalavra(String palavra){
        String pesquisaPalavra = palavrasMap.get(palavra);
        if(!palavrasMap.isEmpty() && pesquisaPalavra != null){
            palavrasMap.get(palavra);
        }else{
            System.out.println("Linguagem não encontrada no dicionário.");
        }
        return pesquisaPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
    
        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    
        // Exibir todas as palavras
        //dicionario.exibirPalavras();
    
        // Pesquisar palavras
        //String definicaoJava = dicionario.pesquisarPorPalavra("java");
        //System.out.println("Definição da linguagem 'java': " + definicaoJava);
    
        //String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        //System.out.println(definicaoCSharp);
    
        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
      }

}
