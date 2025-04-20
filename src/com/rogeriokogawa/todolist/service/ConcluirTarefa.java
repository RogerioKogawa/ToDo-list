package com.rogeriokogawa.todolist.service;

import java.util.ArrayList;

public class ConcluirTarefa {
    ArrayList<String> tarefasConcluidas = new ArrayList<String>();
    DeletarTarefa deletaTarefa = new DeletarTarefa();

    public void terminarTarefa(ArrayList<String> tarefa, int idTarefa){
        System.out.println(tarefa.get(idTarefa - 1) + " concluída(o)!");
        adicionarListaConcluida(tarefa.get(idTarefa));
        deletaTarefa.deletarTarefa(tarefa, idTarefa);
    }

    private void adicionarListaConcluida(String tarefaConcluida){
        tarefasConcluidas.add(tarefaConcluida);
    }
}
