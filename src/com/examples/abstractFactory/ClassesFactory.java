package com.examples.abstractFactory;

import com.examples.abstractFactory.interfaces.IAbstractFactory;

/**
 * Created by ricardo on 2/17/17.
 */
public class ClassesFactory {
    public static IAbstractFactory getFactory(String escolha) {
        if (escolha.equalsIgnoreCase("FORMA"))
            return new FormaFactory();

        if (escolha.equalsIgnoreCase("COR"))
            return new CorFactory();

        return null;
    }
}
