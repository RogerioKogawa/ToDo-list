import java.util.ArrayList;

public class ConcluirTarefa {
    ArrayList<String> tarefasConcluidas = new ArrayList<String>();
    DeletarTarefa deletaTarefa = new DeletarTarefa();

    protected void terminarTarefa(ArrayList<String> tarefa, int idTarefa){
        System.out.println(tarefa.get(idTarefa) + " concluída!");
        adicionarListaConcluida(tarefa.get(idTarefa));
        deletaTarefa.deletarTarefa(tarefa, idTarefa);
    }

    protected void adicionarListaConcluida(String tarefaConcluida){
        tarefasConcluidas.add(tarefaConcluida);
    }
}
