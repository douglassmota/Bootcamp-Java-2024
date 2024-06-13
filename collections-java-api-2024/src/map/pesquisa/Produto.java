package map.pesquisa;

public class Produto {
    //atributos 
    private String nome;
    private int quantidade;
    private double preco;

    //constructor
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    //toString
    @Override
    public String toString() {
        return "{Produto: " + nome + ", quantidade: " + quantidade + ", preco R$" + preco + "}";
    } 

}
