import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    static ArrayList<String> lista = new ArrayList<String>();
    static NovaTarefa novaTarefa = new NovaTarefa();
    static DeletarTarefa deletaTarefa = new DeletarTarefa();
    static AtualizarTarefa atualizarTarefa = new AtualizarTarefa();
    static ConcluirTarefa concluirTarefa = new ConcluirTarefa();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)
;
        System.out.println("Escolha uma das opções: ");

        System.out.println("1 - Criar uma nova tarefa");
        System.out.println("2 - Deletar uma tarefa");
        System.out.println("3 - Modificar uma tarefa");
        System.out.println("4 - Marcar uma tarefa como concluída");
        String opcaoEscolhida = input.nextLine();
        System.out.println("Você escolheu a opção: " + opcaoEscolhida);

        switch(Integer.parseInt(opcaoEscolhida)){
            case 1:
                System.out.println("Digite a tarefa: ");
                String tarefa = input.nextLine();
                novaTarefa.adicionarTarefa(tarefa);
                break;
            case 2:
                System.out.println("Digite o número da tarefa: ");
                int idTarefaDeletar = Integer.parseInt(input.nextLine());
                deletaTarefa.deletarTarefa(lista,idTarefaDeletar);
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
