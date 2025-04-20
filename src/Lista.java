import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    static ArrayList<String> lista = new ArrayList<String>();
    static NovaTarefa novaTarefa = new NovaTarefa();
    static DeletarTarefa deletaTarefa = new DeletarTarefa();
    static AtualizarTarefa atualizarTarefa = new AtualizarTarefa();
    static ConcluirTarefa concluirTarefa = new ConcluirTarefa();
    static MostrarMenu menu = new MostrarMenu();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            String opcaoEscolhida = menu.mostrarMenu();

            switch (Integer.parseInt(opcaoEscolhida)) {
                case 1:
                    System.out.println("Digite a tarefa: ");
                    String tarefa = input.nextLine();
                    novaTarefa.adicionarTarefa(tarefa);
                    lista.add(tarefa);
                    break;
                case 2:
                    System.out.println("Digite o número da tarefa: ");
                    int idTarefaDeletar = Integer.parseInt(input.nextLine());
                    deletaTarefa.deletarTarefa(lista, idTarefaDeletar);
                    break;
                case 3:
                    System.out.println("Digite o número da tarefa: ");
                    int idTarefaAlterar = Integer.parseInt(input.nextLine());
                    atualizarTarefa.modificarTarefa(lista, idTarefaAlterar);
                    break;
                case 4:
                    System.out.println("Digite o numero da tarefa");
                    int idTarefaConcluida = Integer.parseInt(input.nextLine());
                    concluirTarefa.terminarTarefa(lista, idTarefaConcluida);
                    break;
            }
        }
    }
}
