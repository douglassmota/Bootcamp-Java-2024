public class Main {

    public static void main(String[] args) {
        Cliente douglas = new Cliente();
        douglas.setNome("Douglas Mota");

        Conta cc = new ContaCorrente(douglas);
        Conta cp = new ContaPoupanca(douglas);
        
        cc.despositar(100);
        cc.transferir(50, cp);
        cc.imprimirExtrato();
        System.out.println( );
        cp.imprimirExtrato();
    }

}
