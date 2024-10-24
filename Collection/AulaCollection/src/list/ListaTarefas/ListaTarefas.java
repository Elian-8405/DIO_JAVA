package list.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tasks;


    public ListaTarefas(){
        this.tasks = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao ){
        tasks.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        //Lista auxiliar para guardar as tarefas que serão removidas 
        List<Tarefas> tarefasToRemove = new ArrayList<>();
        //Itero sobre as tarefas e guardo as que quero remover
        for(Tarefas t : tasks){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasToRemove.add(t);
            }

        }
        //Uso do removeAll para remover todas a tarefas a serem removidas
        tasks.removeAll(tarefasToRemove);
    }


    public int obeterNumeroTotalTarefas(){
        return tasks.size();
    }

    public void obterDescricoesTarefas(){
      System.out.println(tasks);
    }




}
