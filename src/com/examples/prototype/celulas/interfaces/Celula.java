package com.examples.prototype.celulas.interfaces;

/**
 * Célula é uma classe abstrata que implementa parte do comportamento de uma célula. Todos os tipos de célula
 * devem estender essa classe. A classe Célula implementa "Cloneable" que, em Java, é o recurso que permite
 * a clonagem de um objeto.
 *
 * O método mitose é o metodo a ser implementado pelos tipos de célula para devolver uma nova instância.
 * esse método devolve um Object e, em sua implementação, deve usar a chamada ao método clone definido em
 * Célula. Esse é o método que efetivamente realiza a clonagem do objeto.
 *
 */
public abstract class Celula implements Cloneable{

    protected String tipo;

    public abstract Object mitose();

    public String getTipo() {
        return tipo;
    }

    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException err) {
            err.printStackTrace();
        }

        return clone;
    }

}
