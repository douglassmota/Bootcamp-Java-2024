package set.basic;

public class Convidado {
    //Atributos
    private String nome;
    private int codigoConvite;


    //Constructor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //Metodo Getter para "Impressão"
    public String getNome() {
        return nome;
    }


    public int getCodigoConvite() {
        return codigoConvite;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }
    
    //Metodo toString para não mostrar endereçamento de memoria.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }

    

    

    
    


}
