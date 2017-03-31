package com.examples.interpreter.interfaces;

/**
 * A interface IExpressao deve ser implementada por todas as expressões utilizadas na avaliação de uma sentença.
 * Como a análise contém um padrão recursivo, é necessário que todas utilizem o mesmo método.
 */
public interface IExpressao {
    boolean interpretar(String contexto);
}
