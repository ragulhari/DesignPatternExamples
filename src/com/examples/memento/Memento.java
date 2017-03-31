package com.examples.memento;

/** A classe Memento é a unidade de armazenamento do estado do objeto em questão (no caso uma string).
 * essa classe é usado numa lista dentro da classe Savepoint e cada unidade corresponde a um "save".
 */

class Memento {
    private String state;

    Memento(String s)
    {
        state = s;
    }
    public String getState()
    {
        return this.state;
    }
}
