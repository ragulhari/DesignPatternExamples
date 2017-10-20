package com.examples.composite.game;

import com.examples.composite.interfaces.IObjeto;

import java.util.ArrayList;
import java.util.List;

public class Fase implements IObjeto {
    public String titulo = "";
    int alcanceAtaque = 0;
    List<IObjeto> objetos = new ArrayList<>();

    public Fase(String titulo)
    {
        this.titulo = titulo;
    }

    public List<IObjeto> getObjetos() {
        return objetos;
    }

    //Método que adiciona um objeto subordinado a um objeto atual
    public void add(IObjeto i)
    {
        objetos.add(i);
    }

    /*Método para remoção de subordinados. Para a simplificação do exemplo
    * a única validação é se o inimigo indicado existe.*/
    public void remove(IObjeto i)
    {
        if (objetos.contains(i))
            objetos.remove(i);
    }

    /*Implementação particular de um método "toString()" que obtem os dados do inimigo
     * e estrutura a impressão.
     * */
    public String render()
    {
        return "Fase " + titulo;
    }


}
