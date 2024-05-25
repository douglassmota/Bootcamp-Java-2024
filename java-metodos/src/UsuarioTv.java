public class UsuarioTv {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("A tv esta ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Qual o volume da tv? " + smartTv.volume);

        smartTv.mudarCanal(46);
        System.out.println("Qual canal da minha tv? " + smartTv.canal);

    }
}
