package com.rogeriokogawa.todolist.service;

import java.util.ArrayList;

public class DeletarTarefa {
    public void deletarTarefa(ArrayList<String> listaTarefas, int idTarefa){
        listaTarefas.remove(idTarefa - 1);
    }
}
