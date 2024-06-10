package list.basic;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemCarrinho;

    public CarrinhoDeCompras(){
        this.itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemCarrinho.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i: itemCarrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemCarrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemCarrinho.isEmpty()){
            for(Item item: itemCarrinho){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!"); 
        }
    }

    public void exibirItens(){
        System.out.println(itemCarrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
    
        carrinhoDeCompras.exibirItens();
    
        carrinhoDeCompras.removerItem("Lápis");
    
        carrinhoDeCompras.exibirItens();
    
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
      }
    
   
}
