package set.ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    //atributos
    private String nome;
    private int cod;
    private double preco;
    private int quantidade;

    //constructor
    public Produto(String nome, int cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Metodo comparable
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod!= other.cod)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{" + nome + "," + cod + "," + preco + "," + quantidade + "}";
    }
    

}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        // TODO Auto-generated method stub
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}
