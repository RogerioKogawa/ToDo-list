package com.rogeriokogawa.todolist.controllers;

import com.rogeriokogawa.todolist.interfaces.ITarefaService;
import com.rogeriokogawa.todolist.model.Tarefa;
import com.rogeriokogawa.todolist.service.TarefaService;

import java.util.ArrayList;
import java.util.List;

public class TarefaController {

    private ITarefaService _tarefaService;
    ArrayList<Tarefa> listaTarefas;

    public TarefaController(ITarefaService tarefaService)
    {
        _tarefaService = tarefaService;
    }

    public ArrayList<Tarefa> adicionarTarefa(Tarefa novaTarefa){
        _tarefaService.adicionarTarefa(novaTarefa);
        return listaTarefas;
    }

    public ArrayList<Tarefa> deletarTarefa(Tarefa tarefa){
        _tarefaService.deletarTarefa(tarefa.getId());
        return listaTarefas;
    }

    public ArrayList<Tarefa> terminarTarefa(int idTarefa){
        _tarefaService.terminarTarefa(idTarefa);
        return listaTarefas;
    }

    public ArrayList<Tarefa> modificarTarefa(int idTarefa){
        _tarefaService.modificarTarefa(idTarefa);
        return listaTarefas;
    }
}
