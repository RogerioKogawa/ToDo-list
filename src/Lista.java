import java.util.Scanner;

public class Lista {
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
    }
}
