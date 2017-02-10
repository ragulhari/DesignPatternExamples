package com.examples.memento;

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
