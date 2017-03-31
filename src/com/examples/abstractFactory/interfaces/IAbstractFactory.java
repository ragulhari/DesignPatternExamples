package com.examples.abstractFactory.interfaces;

import com.examples.abstractFactory.cores.interfaces.ICor;
import com.examples.abstractFactory.formas.interfaces.IForma;

/**
 * Interface que define os métodos para os dois Factories disponíveis, "Cor" e "Forma"
 */
public interface IAbstractFactory {
    abstract ICor getCor(String cor);
    abstract IForma getForma(String forma);
}
