package list.basic;


import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRmover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRmover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRmover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();

    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
    
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");

        listaTarefa.obterDescricoesTarefas();
        
    }

}
