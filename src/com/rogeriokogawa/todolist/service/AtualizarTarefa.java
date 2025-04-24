package com.rogeriokogawa.todolist.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AtualizarTarefa {
	ListaService service = new ListaService();
	Scanner input = new Scanner(System.in);
    public void modificarTarefa(ArrayList<String> listaTarefas, int idTarefa) throws IOException{
        System.out.println("Digite o novo nome da tarefa: ");
        String tarefaModificada = input.nextLine();
        listaTarefas.set(idTarefa - 1, tarefaModificada);
        service.atualizarArquivo("", listaTarefas);
    }
}
