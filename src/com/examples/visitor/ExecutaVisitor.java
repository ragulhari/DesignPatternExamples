package com.examples.visitor;

import com.examples.visitor.interfaces.Periferico;

/**
 * Created by ricardo on 2/28/17.
 */
public class ExecutaVisitor {

    public static void go() {
        Periferico computador = new Computador();
        computador.accept(new PerifericoAcaoVisitor());
        System.out.println("----------------");
        computador.accept(new VerificaStatusComponenteVisitor());
    }

}
