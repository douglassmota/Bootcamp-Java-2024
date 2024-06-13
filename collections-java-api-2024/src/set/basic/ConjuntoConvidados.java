package set.basic;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributos
    private Set<Convidado> convidadoSet;

    //Metodo Constructors
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //Metodo Adicionar
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //Metodo Remover    
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRmover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRmover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRmover);
    }

    //Metodo Contar
    public int contarConvidados(){
        return convidadoSet.size();
    }

    //Metodo de exibição
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    
    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    
        // Adicionando convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);
    
        // Exibindo os convidados no conjunto
        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();
    
        // Exibindo o número atualizado de convidados no conjunto
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
    
        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");
    
        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
      }
}
