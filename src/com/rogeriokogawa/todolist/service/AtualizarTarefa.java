package com.rogeriokogawa.todolist.service;

import java.util.ArrayList;
import java.util.Scanner;

public class AtualizarTarefa {
    Scanner input = new Scanner(System.in);
    public void modificarTarefa(ArrayList<String> listaTarefas, int idTarefa){
        System.out.println("Digite o novo nome da tarefa: ");
        String tarefaModificada = input.nextLine();
        listaTarefas.set(idTarefa - 1, tarefaModificada);
    }
}
