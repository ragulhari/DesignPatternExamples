package com.examples.abstractFactory.formas;

import com.examples.abstractFactory.formas.interfaces.IForma;

/**
 * Classe "circulo", implementando a interface IForma
 */
public class Circulo implements IForma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo");
    }
}
