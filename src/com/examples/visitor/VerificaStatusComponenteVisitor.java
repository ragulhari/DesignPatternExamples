package com.examples.visitor;

import com.examples.visitor.interfaces.PerifericoVisitor;

/**
 * Created by ricardo on 2/28/17.
 */
public class VerificaStatusComponenteVisitor implements PerifericoVisitor {
    @Override
    public void visitar(Computador computador) {
        System.out.println("Computador verificado");
        System.out.println("Existem " + computador.componentes.length + " componentes conectados");
    }

    @Override
    public void visitar(Mouse mouse) {
        System.out.println("Mouse conectado ao computador");
    }

    @Override
    public void visitar(Teclado teclado) {
        System.out.println("Teclado conectado ao computador");
    }

    @Override
    public void visitar(Monitor monitor) {
        System.out.println("Monitor conectado ao computador");
    }
}
