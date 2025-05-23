package com.rogeriokogawa.todolist.service;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;

public class ListaService {
    public void imprimirLista(ArrayList<String> lista) throws IOException{
        System.out.println("Lista");
        System.out.println();
        for(int i = 0; i< lista.size(); i++){
            System.out.println((i+1) + "-) "+ lista.get(i));
        }
        System.out.println();
    }

    public boolean atualizarArquivo(String caminho,ArrayList<String> listaTarefas) throws IOException{
        try{
            FileWriter arquivo = new FileWriter(caminho,false);
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            
            for(String tarefa: listaTarefas) {
            	gravarArquivo.println(tarefa);
            }
            
            gravarArquivo.close();
            return true;
        }catch (IOException e){
            System.out.println("Erro ao atualizar o arquivo: " + e.getMessage());
            return false;
        }
        
    }
}
