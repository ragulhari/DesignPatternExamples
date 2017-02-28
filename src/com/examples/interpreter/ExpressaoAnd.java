package com.examples.interpreter;

import com.examples.interpreter.interfaces.Expressao;

/**
 * Created by ricardo on 2/28/17.
 */
public class ExpressaoAnd implements Expressao {
    private Expressao expressao1 = null;
    private Expressao expressao2 = null;

    public ExpressaoAnd(Expressao expressao1, Expressao expressao2) {
        this.expressao1 = expressao1;
        this.expressao2 = expressao2;
    }

    @Override
    public boolean interpretar(String contexto) {
        return expressao1.interpretar(contexto) && expressao2.interpretar(contexto);
    }
}
