package com.rogeriokogawa.todolist.service;

import java.io.IOException;
import java.util.ArrayList;

public class DeletarTarefa {
	ListaService service = new ListaService();
	
    public void deletarTarefa(ArrayList<String> listaTarefas, int idTarefa) throws IOException{
        listaTarefas.remove(idTarefa - 1);
        service.atualizarArquivo("C:\\\\Users\\\\roger\\\\Desktop\\\\arquivotxttodolist\\\\lista.txt", listaTarefas);
    }
}
