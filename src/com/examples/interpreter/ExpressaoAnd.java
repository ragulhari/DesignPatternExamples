package com.examples.interpreter;

import com.examples.interpreter.interfaces.IExpressao;

/**
 * Classe que define a análise da expressão AND, implementando o método "interpretar" para verificar
 * se o dado informado é verdadeiro ou falso.
 */
public class ExpressaoAnd implements IExpressao {
    private IExpressao expressao1 = null;
    private IExpressao expressao2 = null;

    public ExpressaoAnd(IExpressao expressao1, IExpressao expressao2) {
        this.expressao1 = expressao1;
        this.expressao2 = expressao2;
    }

    @Override
    public boolean interpretar(String contexto) {
        return expressao1.interpretar(contexto) && expressao2.interpretar(contexto);
    }
}
