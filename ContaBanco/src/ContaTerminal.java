import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 250.00D;   

        //Exibir as mensagens para o nosso usuario

        System.out.println("Por favor, informe o seu nome completo: ");
        //Obter pela scanner os valores digitados no terminal
        String nome = scanner.nextLine();

        System.out.println(" ");

        System.out.println("Numero da conta: ");
        //Obter pela scanner os valores digitados no terminal
        int conta = scanner.nextInt();

        System.out.println(" ");

        System.out.println("Informe o numero da sua agencia: ");
        //Obter pela scanner os valores digitados no terminal
        String agencia = scanner.next();

        System.out.println(" ");

        //Exibir a mensagem conta criada 

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + 
        " - conta " + conta + " e seu saldo de: " + saldo + " já esta disponivel para saque.");
        
    }
}
