package com.rogeriokogawa.todolist.service;

import java.util.ArrayList;

public class DeletarTarefa {
    private ListaService service = new ListaService();
    public void deletarTarefa(ArrayList<String> listaTarefas, int idTarefa){
        listaTarefas.remove(idTarefa - 1);
        //service.atualizarArquivo("C:\\\\Users\\\\roger\\\\Desktop\\\\arquivotxttodolist\\\\lista.txt", listaTarefas.get(i));
    }
}
