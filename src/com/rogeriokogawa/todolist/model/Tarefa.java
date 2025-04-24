package com.rogeriokogawa.todolist.model;
import java.util.Date;

public class Tarefa {
    private int Id;
    private String nome;

    public Tarefa(String nome){
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }
}
