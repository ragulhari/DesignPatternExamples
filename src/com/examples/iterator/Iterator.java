package com.examples.iterator;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Essa classe implementa um iterador de objetos do tipo "Valor".
 */
public class Iterator {
    /*Os itens do tipo valor são armazenados em um objeto do tipo Hashtable
    * o objeto indice armazena o indice atual do iterador enquanto o valor numItens
    * guarda o total de itens armazenados*/
    private Hashtable itens;
    public int indice;
    public int numItens;

    public Iterator() {
        itens = new Hashtable();
        indice = 0;
        numItens = 0;
    }

    //Adiciona um item no iterador e soma o total de itens
    public int add(Object item) {
        itens.put(numItens, item);
        numItens++;
        return numItens;
    }

    //Busca o item de indice 0 do iterador
    public Object getFirst() {
        return itens.get(0);
    }

    //Método que verifica se o iterador chegou ao final
    public boolean isDone() {
        if (indice == numItens)
            return true;
        else
            return false;
    }

    /*Retorna o item de um indice especificado. Há uma verificação para caso o índice passado seja maior
      que o número de itens. */
    public Object get(int index) {
        if (index > numItens)
            return null;
        return itens.get(index);
    }

    //Navega para o proximo item da lista do iterador
    public boolean next() {
        if (indice < numItens) {
            indice++;
            return true;
        } else
            return false;
    }

    //Navega para o item anterior da lista do iterador
    public boolean last() {
        if (indice > 0) {
            indice--;
            return true;
        } else
        {
            return false;
        }
    }

    //Pega o item atual na navegaçao do iterador
    public Object getCurrentItem() {
        return itens.get(indice);
    }

}
