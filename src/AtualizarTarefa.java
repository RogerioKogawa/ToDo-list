import java.util.ArrayList;
import java.util.Scanner;

public class AtualizarTarefa {
    Scanner input = new Scanner(System.in);
    private void modificarTarefa(ArrayList<String> listaTarefas, int idTarefa){
        System.out.println("Digite o novo nome da tarefa: ");
        String tarefaModificada = input.nextLine();
        listaTarefas.set(idTarefa, tarefaModificada);
    }
}
