package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //Atributos
    
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    //metodo constructor vazio
    public Mentoria() {
    }

    //metodo Getters e Setters
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    

    

}
