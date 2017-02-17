package com.examples.abstractFactory.interfaces;

import com.examples.abstractFactory.cores.interfaces.ICor;
import com.examples.abstractFactory.formas.interfaces.IForma;

/**
 * Created by ricardo on 2/17/17.
 */
public interface IAbstractFactory {
    abstract ICor getCor(String cor);
    abstract IForma getForma(String forma);
}
