package com.examples.abstractFactory;

import com.examples.abstractFactory.cores.interfaces.ICor;
import com.examples.abstractFactory.formas.Circulo;
import com.examples.abstractFactory.formas.Quadrado;
import com.examples.abstractFactory.formas.Retangulo;
import com.examples.abstractFactory.formas.interfaces.IForma;
import com.examples.abstractFactory.interfaces.IAbstractFactory;

/**
 * Created by ricardo on 2/17/17.
 */
public class FormaFactory implements IAbstractFactory {
    @Override
    public ICor getCor(String cor) {
        return null;
    }

    @Override
    public IForma getForma(String forma) {

        if (forma == null)
            return null;

        if (forma.equalsIgnoreCase("CIRCULO"))
            return new Circulo();

        if (forma.equalsIgnoreCase("QUADRADO"))
            return new Quadrado();

        if (forma.equalsIgnoreCase("RETANGULO"))
            return new Retangulo();

        return null;
    }
}
