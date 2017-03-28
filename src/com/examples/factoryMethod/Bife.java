package com.examples.factoryMethod;

import com.examples.factoryMethod.interfaces.IPrato;

/**
 * Essa é uma subclasse de IPrato, sendo um dos possíveis objetos criados pelo factoryMethod
 */
public class Bife implements IPrato {
    @Override
    public void cozinhar() {
        System.out.println("Soltando um bife ao ponto!");
    }
}
