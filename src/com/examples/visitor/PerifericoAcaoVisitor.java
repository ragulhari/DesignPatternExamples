package com.examples.visitor;

import com.examples.visitor.interfaces.PerifericoVisitor;

/**
 * Created by ricardo on 2/28/17.
 */
public class PerifericoAcaoVisitor implements PerifericoVisitor {
    @Override
    public void visitar(Computador computador) {
        System.out.println("Inicializando o computador");
    }

    @Override
    public void visitar(Mouse mouse) {
        System.out.println("Inicializando o mouse");
    }

    @Override
    public void visitar(Teclado teclado) {
        System.out.println("Inicializando o teclado");
    }

    @Override
    public void visitar(Monitor monitor) {
        System.out.println("Inicializando o monitor");
    }
}
