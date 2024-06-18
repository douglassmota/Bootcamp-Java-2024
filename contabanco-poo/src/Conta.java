public  abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 3146;
    private static int SEQUENCIAL = 18036;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void despositar(double valor) {
        saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.despositar(valor);
        
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirAtributo() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
