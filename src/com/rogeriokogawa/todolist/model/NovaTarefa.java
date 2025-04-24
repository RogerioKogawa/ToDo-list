package com.rogeriokogawa.todolist.model;

import com.rogeriokogawa.todolist.service.ListaService;
import java.io.IOException;

public class NovaTarefa {
    private String tarefa;
    private ListaService service = new ListaService();

    public String adicionarTarefa(String tarefaNova) throws IOException {
        this.tarefa = tarefaNova;
        service.atualizarArquivo("C:\\\\Users\\\\roger\\\\Desktop\\\\arquivotxttodolist\\\\lista.txt", tarefa);
        return tarefa;
    }
}
