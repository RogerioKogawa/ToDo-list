package com.rogeriokogawa.todolist.service;

import java.util.ArrayList;

public class ListaService {
    public void imprimirLista(ArrayList<String> lista){
        System.out.println("Lista");
        System.out.println();
        for(int i = 0; i< lista.size(); i++){
            System.out.println((i+1) + "-) "+ lista.get(i));
        }
        System.out.println();
    }
}
