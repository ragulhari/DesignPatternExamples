package com.examples.prototype;

import com.examples.prototype.celulas.interfaces.Celula;

/**
 * Created by ricardo on 2/18/17.
 */
public class ExecutaPrototype {

    public static void go() {
        RepositorioCelulas repo = new RepositorioCelulas();

        Celula ep = (Celula) repo.novaCelula("epitelial");
        System.out.println(ep.getTipo());

        Celula st = (Celula) repo.novaCelula("estomacal");
        System.out.println(st.getTipo());

        Celula bc = (Celula) repo.novaCelula("bucal");
        System.out.println(bc.getTipo());
    }

}
