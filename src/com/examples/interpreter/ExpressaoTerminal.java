package com.examples.interpreter;

import com.examples.interpreter.interfaces.Expressao;

/**
 * Created by ricardo on 2/28/17.
 */
public class ExpressaoTerminal implements Expressao {

    private String informacao;

    public ExpressaoTerminal(String info) {
        this.informacao = info;
    }

    @Override
    public boolean interpretar(String contexto) {
        if (contexto.contains(informacao))
            return true;

        return false;
    }
}
