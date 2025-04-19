import java.util.ArrayList;

public class ConcluirTarefa {
    ArrayList<String> tarefasConcluidas = new ArrayList<String>();

    private void terminarTarefa(ArrayList<String> tarefa, int idTarefa){
        System.out.println(tarefa.get(idTarefa) + " concluída!");
        adicionarListaConcluida(tarefa.get(idTarefa));
    }
    
    private void adicionarListaConcluida(String tarefaConcluida){
        tarefasConcluidas.add(tarefaConcluida);

    }
}
