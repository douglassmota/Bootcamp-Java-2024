package set.ordenacao;

import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributos
    public Set<Aluno> alunoSet;

    //constructor
    public GerenciadorAlunos() {
        this.alunoSet = new TreeSet<>();
    }

    //metodos
    public void adicionarAluno(String nome, int matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula){
        Aluno alunoParaRemover = null;
        if(!alunoSet.isEmpty()){
            for(Aluno a : alunoSet){
                if(a.getMatricula()== matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        }else{
            System.out.println("O conjunto esta vazio.");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()){
            System.out.println(alunoPorNome);
        }else{
            System.out.println("O conjunto esta vazio");
        }     
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!alunoSet.isEmpty()){
            alunoPorNota.addAll(alunoSet);
            System.out.println(alunoPorNota);
        }else{
            System.out.println("O conjunto esta vazio");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 1, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 4, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 7, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 0, 6.8);
    
        // Exibindo todos os alunos no gerenciador
        //System.out.println("Alunos no gerenciador:");
        //System.out.println(gerenciadorAlunos.alunoSet);
    
        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        //gerenciadorAlunos.removerAluno(4);
        //gerenciadorAlunos.removerAluno(7);
        //System.out.println(gerenciadorAlunos.alunoSet);
    
        // Exibindo alunos ordenados por nome
        //gerenciadorAlunos.exibirAlunosPorNome();
    
        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
      }


}
