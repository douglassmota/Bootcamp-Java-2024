package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    private Set<Tarefa> tarefaSet;

    //constructor
    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    //metodos
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa f : tarefaSet){
                if(f.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = f;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else{
            System.out.println("O conjunto esta vazio");
        } 
            
    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else{
            System.out.println("Lista de tarefas vazia");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tc : tarefaSet){
            if(tc.isConclusao()){
                tarefasConcluidas.add(tc);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tp : tarefaSet){
            if(!tp.isConclusao()){
                tarefasPendentes.add(tp);
            }
        }
        return tarefasPendentes;
        
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
            t.setConclusao(true);
          }
        }
      }

      public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefaParaMarcarComoPendente = t;
            break;
          }
        }
    
        if (tarefaParaMarcarComoPendente != null) {
          if(tarefaParaMarcarComoPendente.isConclusao()) {
            tarefaParaMarcarComoPendente.setConclusao(false);
          }
        } else {
          System.out.println("Tarefa não encontrada na lista.");
        }
      } 
      
      public void limparListaTarefas() {
        if(tarefaSet.isEmpty()) {
          System.out.println("A lista já está vazia!");
        } else {
          tarefaSet.clear();
        }
      }

      public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();
    
        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
      }
    
}
