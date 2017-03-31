package com.examples.visitor.interfaces;

/**
 * Definição da interface que deve ser implementada por todos os compnentes do computador. O método "accept"
 * é o que será responsável pela execução do Visitor.
 */
public interface IPeriferico {
    void accept (IPerifericoVisitor visitor);
}
