package com.examples.abstractFactory;

import com.examples.abstractFactory.interfaces.IAbstractFactory;

/**
 * Classe que funciona como um "Factory de factories". Basicamente possui um método
 * "getFactory" que recebe como parâmetro o tipo de factory necessário e retona um objeto
 * do tipo IAbstractFactory
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
