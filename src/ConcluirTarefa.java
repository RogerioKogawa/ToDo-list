import java.util.ArrayList;

public class ConcluirTarefa {
    ArrayList<String> tarefasConcluidas = new ArrayList<String>();

    protected void terminarTarefa(ArrayList<String> tarefa, int idTarefa){
        System.out.println(tarefa.get(idTarefa) + " concluída!");
        adicionarListaConcluida(tarefa.get(idTarefa));
    }

    protected void adicionarListaConcluida(String tarefaConcluida){
        tarefasConcluidas.add(tarefaConcluida);

    }
}
