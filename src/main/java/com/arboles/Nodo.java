package com.arboles;
import java.util.ArrayList;

public class Nodo {
    private String id;
    private String valor;
    private  ArrayList<Nodo> children;
    public Nodo(String id) {
        this.id = id;
        this.children = new ArrayList<>();
    }
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getValor() {return valor;}
    public void setValor(String valor) {this.valor = valor;}
    public ArrayList<Nodo> getHijos() {return children;}
    public void addCHildren(Nodo nodo) {this.children.add(nodo);}
}
