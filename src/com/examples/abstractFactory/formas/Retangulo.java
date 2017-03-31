package com.examples.abstractFactory.formas;

import com.examples.abstractFactory.formas.interfaces.IForma;

/**
 * Classe "retângulo", implementando a interface IForma
 */
public class Retangulo implements IForma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo");
    }
}
