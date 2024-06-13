package set.basic;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributos
    private Set<String> palavrasUnicas;

//Metodo Constructors
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

//Metodo Adicionar 
    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    //Metodo Remover 
    public void removerPalavra(String palavra){
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
              palavrasUnicas.remove(palavra);
            } else {
              System.out.println("Palavra não encontrada no conjunto!");
            }
          } else {
            System.out.println("O conjunto está vazio!");
          }
    }

    //Metodo que verifica se "Contem" essa palavra na lista
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
      }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();
    
        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");
    
        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        //Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");
    
        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));
    
        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
      }


}
