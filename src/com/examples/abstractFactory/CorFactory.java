package com.examples.abstractFactory;

import com.examples.abstractFactory.cores.Azul;
import com.examples.abstractFactory.cores.Verde;
import com.examples.abstractFactory.cores.Vermelho;
import com.examples.abstractFactory.cores.interfaces.ICor;
import com.examples.abstractFactory.formas.interfaces.IForma;
import com.examples.abstractFactory.interfaces.IAbstractFactory;

/**
 * Created by ricardo on 2/17/17.
 */
public class CorFactory implements IAbstractFactory {
    @Override
    public ICor getCor(String cor) {
        if (cor == null)
            return null;

        if (cor.equalsIgnoreCase("VERMELHO"))
            return new Vermelho();

        if (cor.equalsIgnoreCase("VERDE"))
            return new Verde();

        if (cor.equalsIgnoreCase("AZUL")) {
            return new Azul();
        }

        return null;

    }

    @Override
    public IForma getForma(String forma) {
        return null;
    }
}
