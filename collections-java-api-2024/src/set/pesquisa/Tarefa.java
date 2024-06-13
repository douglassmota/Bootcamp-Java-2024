package set.pesquisa;

public class Tarefa {
    //atributo
    private String descricao;
    private boolean conclusao;

    //constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.conclusao = false;
    }


    //getter
    public String getDescricao() {
        return descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    //setter
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    //toString
    @Override
    public String toString() {
        return "{" + descricao + "," + conclusao + "}";
    }

}
