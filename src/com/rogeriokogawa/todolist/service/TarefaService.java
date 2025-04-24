package com.rogeriokogawa.todolist.service;

import com.rogeriokogawa.todolist.interfaces.ITarefaService;
import com.rogeriokogawa.todolist.model.Tarefa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaService implements ITarefaService {
    Scanner input = new Scanner(System.in);
    int idTarefa;
    @Override
    public void imprimirLista() throws IOException{
        System.out.println("Lista");
        System.out.println();
        for(int i = 0; i<=listaTarefas.size(); i++){
            System.out.println((i+1) + "-) "+ listaTarefas.get(i));
        }
        System.out.println();

    }

    ArrayList<Tarefa> listaTarefas = new ArrayList<Tarefa>();
    @Override
    public void modificarTarefa(int idTarefa) {
        System.out.println("Digite o novo nome da tarefa: ");
        String tarefaModificada = input.nextLine();
        Tarefa tarefa = listaTarefas.get(idTarefa -1);
        tarefa.setNome(tarefaModificada);
    }

    @Override
    public void terminarTarefa(int idTarefa) {
        Tarefa tarefaConcluida = listaTarefas.get(idTarefa - 1);
        System.out.println(tarefaConcluida + " concluída(o)!");
        adicionarListaConcluida(tarefaConcluida);
        deletarTarefa(idTarefa);
    }

    @Override
    public void adicionarListaConcluida(Tarefa tarefaConcluida) {
        tarefasConcluidas.add(tarefaConcluida);
    }

    ArrayList<Tarefa> tarefasConcluidas = new ArrayList<Tarefa>();

    @Override
    public ArrayList<Tarefa> deletarTarefa(int idTarefa) {
        listaTarefas.remove(idTarefa - 1);
        return listaTarefas;
    }

    @Override
    public ArrayList<Tarefa> adicionarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
        return listaTarefas;
    }

    @Override
    public boolean atualizarArquivo(String caminho, String tarefa) throws IOException{
        try{
            FileWriter arquivo = new FileWriter(caminho,true);
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            gravarArquivo.println(tarefa);
            gravarArquivo.close();
            return true;
        }catch (IOException e){
            System.out.println("Erro ao atualizar o arquivo: " + e.getMessage());
            return false;
        }
    }
}
