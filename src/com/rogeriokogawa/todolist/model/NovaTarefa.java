package com.rogeriokogawa.todolist.model;

import java.io.IOException;
import java.util.ArrayList;

import com.rogeriokogawa.todolist.service.ListaService;

public class NovaTarefa {
	ListaService service = new ListaService();
    private String tarefa;

    public void adicionarTarefa(String tarefaNova, ArrayList<String> listaTarefas) throws IOException{
        this.tarefa = tarefaNova;
        listaTarefas.add(tarefaNova);
        service.atualizarArquivo("C:\\\\Users\\\\roger\\\\Desktop\\\\arquivotxttodolist\\\\lista.txt", listaTarefas);
    }
}
