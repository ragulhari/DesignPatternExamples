package com.examples.memento;

/**
 * O objeto GameSaveControl é o objeto que controla o estado armazenado (no caso a string State é o que é
 * armazenado). Existem dois métodos referentes a guardar a informação temporariamente e outros dois que
 * armazenam o conteúdo no Memento.
 */
public class GameSaveControl {

    private String state;

    //Métodos que armazenam o estado fora do memento (estado é sobrescrito)
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }

    //Métodos que armazenam o estado no memento (estado é armazenado)
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
