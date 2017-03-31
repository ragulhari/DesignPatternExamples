package com.examples.abstractFactory.formas;

import com.examples.abstractFactory.formas.interfaces.IForma;

/**
 * Classe "quadrado", implementando a interface IForma
 */
public class Quadrado implements IForma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando quadrado");
    }
}
