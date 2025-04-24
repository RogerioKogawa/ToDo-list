package com.rogeriokogawa.todolist.app;

import com.rogeriokogawa.todolist.interfaces.ITarefaService;
import com.rogeriokogawa.todolist.model.Tarefa;
import com.rogeriokogawa.todolist.service.TarefaService;
import com.rogeriokogawa.todolist.util.MostrarMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {
    static ArrayList<Tarefa> listaTarefas = new ArrayList<Tarefa>();
    static MostrarMenu menu = new MostrarMenu();
    private static ITarefaService _tarefaService;

    public TarefaApp(ITarefaService tarefaService)
    {
        _tarefaService = tarefaService;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while(true) {
            String opcaoEscolhida = menu.mostrarMenu();

            switch (Integer.parseInt(opcaoEscolhida)) {
                case 1:
                    System.out.println("Digite a tarefa: ");
                    String tarefa = input.nextLine();

                    Tarefa novaTarefa = new Tarefa(tarefa);

                    _tarefaService.adicionarTarefa(novaTarefa);
                    listaTarefas.add(novaTarefa);
                    break;
                case 2:
                    System.out.println("Digite o número da tarefa: ");
                    int idTarefaDeletar = Integer.parseInt(input.nextLine());
                    _tarefaService.deletarTarefa(idTarefaDeletar);
                    break;
                case 3:
                    System.out.println("Digite o número da tarefa: ");
                    int idTarefaAlterar = Integer.parseInt(input.nextLine());
                    _tarefaService.modificarTarefa(idTarefaAlterar);
                    break;
                case 4:
                    System.out.println("Digite o numero da tarefa");
                    int idTarefaConcluida = Integer.parseInt(input.nextLine());
                    _tarefaService.terminarTarefa(idTarefaConcluida);
                    break;
            }
            _tarefaService.imprimirLista();
        }
    }
}
