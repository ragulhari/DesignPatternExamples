package com.examples.iterator;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by ricardo on 2/20/17.
 */
public class Iterator {
    private Hashtable itens;
    private Enumeration e;
    private int itemAtual;
    public int indice;
    public int numItens;

    public Iterator() {
        itens = new Hashtable();
        indice = 0;
        numItens = 0;
    }

    public int add(Object item) {
        itens.put(numItens, item);
        numItens++;
        return numItens;
    }

    public Object getFirst() {
        return itens.get(0);
    }

    public boolean isDone() {
        if (indice == numItens)
            return true;
        else
            return false;
    }

    public Object get(int index) {
        if (index > numItens)
            return null;
        return itens.get(index);
    }

    public boolean next() {
        if (indice < numItens) {
            indice++;
            return true;
        } else
            return false;
    }

    public boolean last() {
        if (indice > 0) {
            indice--;
            return true;
        } else
        {
            return false;
        }
    }

    public Object getCurrentItem() {
        return itens.get(indice);
    }

}
