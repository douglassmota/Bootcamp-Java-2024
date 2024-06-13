package map.ordenacao;

public class Evento {
    //atributo
    private String evento;
    private String atracao;

    //constructor
    public Evento(String evento, String atracao) {
        this.evento = evento;
        this.atracao = atracao;
    }

    //getters
    public String getEvento() {
        return evento;
    }

    public String getAtracao() {
        return atracao;
    }

    //toString
    @Override
    public String toString() {
        return "Evento [evento=" + evento + ", atracao=" + atracao + "]";
    }

}
