import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        System.out.println("Processo Seletivo");
        System.out.println(" ");

        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
	
	//método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    static void analisarCandidato (double salarioPretendido){

       double salarioBase = 2000.0;
        
        if(salarioBase < salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato, com contra proposta");
    
    }

    static void selecaoCandidatos(){
    String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
        String candidato = candidatos[candidatoAtual]; 
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato + " solicitou este valor de salario R$" + salarioPretendido);
        if(salarioBase >= salarioPretendido){
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
        }else{
            System.out.println("Desculpe " + candidato + " voce não foi selecionado.");
        }

        candidatoAtual++;
    }
        
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }
}
