package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new pessoa(nome, idade, altura));
    }

    public List<pessoa> ordenarPorIdade(){
        List<pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    } 
    
    public List<pessoa> ordenarPorAltura(){
        List<pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
          OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
      
          // Adicionando pessoas à lista
          ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
          ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
          ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
          ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
      
          // Exibindo a lista de pessoas adicionadas
          System.out.println(ordenacaoPessoas.pessoaList);
      
          // Ordenando e exibindo por idade
          System.out.println(ordenacaoPessoas.ordenarPorIdade());
      
          // Ordenando e exibindo por altura
          System.out.println(ordenacaoPessoas.ordenarPorAltura());
        }

}







