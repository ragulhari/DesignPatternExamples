package com.examples.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ricardo on 2/10/17.
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
