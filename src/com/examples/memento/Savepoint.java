package com.examples.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe Savepoint tem por objetivo manter uma lista de Mementos. É essa classe que garante a manutenção
 * dos estados do objeto durante a execução do programa.s
 */
public class Savepoint {
    private List<Memento> mem = new ArrayList<>();

    public void add(Memento state) {
        mem.add(state);
    }

    public Memento get(int index){
        return mem.get(index);
    }
}
