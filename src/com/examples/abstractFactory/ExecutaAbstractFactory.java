package com.examples.abstractFactory;

import com.examples.abstractFactory.cores.interfaces.ICor;
import com.examples.abstractFactory.formas.interfaces.IForma;
import com.examples.abstractFactory.interfaces.IAbstractFactory;

/**
 * Created by ricardo on 2/17/17.
 */
public class ExecutaAbstractFactory {
    public static void go() {
        IAbstractFactory abstractFactory;
        IForma forma;
        ICor cor;

        abstractFactory = ClassesFactory.getFactory("FORMA");

        forma = abstractFactory.getForma("CIRCULO");
        forma.desenhar();

        forma = abstractFactory.getForma("QUADRADO");
        forma.desenhar();

        forma = abstractFactory.getForma("RETANGULO");
        forma.desenhar();

        abstractFactory = ClassesFactory.getFactory("COR");

        cor = abstractFactory.getCor("VERMELHO");
        cor.preencher();

        cor = abstractFactory.getCor("VERDE");
        cor.preencher();

        cor = abstractFactory.getCor("AZUL");
        cor.preencher();


    }
}
