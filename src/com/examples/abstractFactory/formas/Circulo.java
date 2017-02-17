package com.examples.abstractFactory.formas;

import com.examples.abstractFactory.formas.interfaces.IForma;

/**
 * Created by ricardo on 2/17/17.
 */
public class Circulo implements IForma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo");
    }
}
