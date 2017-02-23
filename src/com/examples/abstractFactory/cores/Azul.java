package com.examples.abstractFactory.cores;

import com.examples.abstractFactory.cores.interfaces.ICor;

/**
 * Classe "azul", implementando a interface ICor
 */
public class Azul implements ICor {
    @Override
    public void preencher() {
        System.out.println("Preenchendo com a cor azul");
    }
}
