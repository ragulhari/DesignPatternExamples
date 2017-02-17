package com.examples.abstractFactory.cores;

import com.examples.abstractFactory.cores.interfaces.ICor;

/**
 * Created by ricardo on 2/17/17.
 */
public class Verde implements ICor {
    @Override
    public void preencher() {
        System.out.println("Preenchendo com a cor verde");
    }
}
