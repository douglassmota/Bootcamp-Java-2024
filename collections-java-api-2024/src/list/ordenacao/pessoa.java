package list.ordenacao;

import java.util.Comparator;

public class pessoa implements Comparable<pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }   

}

class ComparatorPorAltura implements Comparator<pessoa>{

    @Override
    public int compare(pessoa p1, pessoa p2) {
        // TODO Auto-generated method stub
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

    
}