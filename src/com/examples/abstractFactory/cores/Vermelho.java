package com.examples.abstractFactory.cores;

import com.examples.abstractFactory.cores.interfaces.ICor;

/**
 * Classe "vermelho", implementando a interface ICor
 */
public class Vermelho implements ICor {

    @Override
    public void preencher() {
        System.out.println("Preenchendo com a cor vermelha");
    }
}
