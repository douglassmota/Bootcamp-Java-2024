package aparelho;

import funcionalidade.Celular;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {
        Celular iphone = new Celular();

        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;
        ReprodutorMusical reprodutorMusical = iphone;

        aparelhoTelefonico.atender();
        navegadorInternet.adicionarNovaAba();
        reprodutorMusical.tocar();
    }
}
