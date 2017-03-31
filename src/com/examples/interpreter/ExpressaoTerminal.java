package com.examples.interpreter;

import com.examples.interpreter.interfaces.IExpressao;

/**
 A expressão TERMINAL avalia no método "interpretar" se o valor passado está contido na informação ou não.
 Essa análise é usada em composição com as análises AND e OR para analisar as expressões.
 */
public class ExpressaoTerminal implements IExpressao {

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
