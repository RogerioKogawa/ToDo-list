package com.rogeriokogawa.todolist.interfaces;
import com.rogeriokogawa.todolist.model.Tarefa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public interface ITarefaService {
    ArrayList<Tarefa> deletarTarefa(int idTarefa);
    ArrayList<Tarefa> adicionarTarefa(Tarefa tarefa);
    public void imprimirLista()throws IOException;
    public boolean atualizarArquivo(String caminho, String tarefa) throws IOException;
    public void modificarTarefa(int idTarefa);
    public void terminarTarefa(int idTarefa);
    public void adicionarListaConcluida(Tarefa tarefaConcluida);
}
