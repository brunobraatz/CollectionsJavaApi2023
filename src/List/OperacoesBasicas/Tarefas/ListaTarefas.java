package List.OperacoesBasicas.Tarefas;

import java.util.ArrayList;
import java.util.List;
public class ListaTarefas {

   private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    //Métodos do exercício
    public void adicionarTarefa (String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!listaDeTarefas.isEmpty()) {
            for (Tarefa t : listaDeTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }
            listaDeTarefas.removeAll(tarefasParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }


    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaDeTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterNumeroTotalTarefas());

    }
}
