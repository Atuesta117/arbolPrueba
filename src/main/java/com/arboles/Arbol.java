package com.arboles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arbol {
    private Nodo raiz;
    public Arbol() {
      raiz = new Nodo("0");
      raiz.setValor("");
    }
    List<String> idSectionsBoard = Arrays.asList( "1", "2", "3", "4", "5", "6");
    List<String> idBoxesBoard = Arrays.asList(".1", ".2", ".3", ".4", ".5", ".6");

    private void setNodo(String father ,String children){
        if(father.equals("0")){
            Nodo nodo = new Nodo(children);
            raiz.addCHildren(nodo);

        }
        else{
            for(Nodo nodo : raiz.getHijos()){
                if(nodo.getId().equals(father)){
                    Nodo nodo2 = new Nodo(father + children);
                    nodo.addCHildren(nodo2);
                }
            }
        }

    }
    public void inicializeSections(){
        for(String idSection : idSectionsBoard){
                setNodo("0", idSection);

        }

        for(int i=0; i < 6; i++) {
            for(int j=0; j < 6; j++) {
                setNodo(idSectionsBoard.get(i), idBoxesBoard.get(j));
            }


        }
        for(Nodo nodo : raiz.getHijos()){
            System.out.println(nodo.getId());
            System.out.println("NODOS HIJOS DE " + nodo.getId());
            for(Nodo nodo2 : nodo.getHijos()){
                System.out.println(nodo2.getId());
            }
        }


    }

    public void setNodesValues(String idFather, List<String> values){
        for(Nodo nodo : raiz.getHijos()){
            if(nodo.getId().equals(idFather)){
                ArrayList<Nodo> nodoChildren = nodo.getHijos();
                for(int i=0; i < 6; i++){
                    nodoChildren.get(i).setValor(values.get(i));
                    System.out.println("Valores de los nodos hijos");
                    System.out.println(nodoChildren.get(i).getId()+ ": " + nodoChildren.get(i).getValor());
                }
            }
        }
    }

    public static void main(String[] args){
        Arbol arbol = new Arbol();
        arbol.inicializeSections();
        List<String> valores = Arrays.asList("1", "2", "3", "4", "5", "6");
        arbol.setNodesValues("1", valores);

    }

}
