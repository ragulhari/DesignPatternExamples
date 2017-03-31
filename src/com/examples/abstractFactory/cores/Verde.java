package com.examples.abstractFactory.cores;

import com.examples.abstractFactory.cores.interfaces.ICor;

/**
 * Classe "verde", implementando a interface ICor
 */
public class Verde implements ICor {
    @Override
    public void preencher() {
        System.out.println("Preenchendo com a cor verde");
    }
}
