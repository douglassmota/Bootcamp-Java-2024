package funcionalidade;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Celular implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("TOCANDO MUSICA PELO IPHONE");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("PAUSANDO MUSICA PELO IPHONE");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("SELECIONANDO NOVA MUSICA PELO IPHONE" + musica);
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println("EXIBINDO PAGINA DA INTERNET PELO IPHONE" + url);
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("ADICIONANDO NOVA ABA DE INTERNET PELO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("ATUALIZANDO PAGINA DA INTERNET PELO IPHONE");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("REALIZANDO LIGACAO PELO IPHONE" + numero);
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("ATENDENDO LIGACAO PELO IPHONE");
    }

    @Override
    public void iniciarCorreioVoz(String musica) {
        // TODO Auto-generated method stub
        System.out.println("INICIANDO CORREIO DE VOZ PELO IPHONE" + musica);
    }

}
