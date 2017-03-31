package com.examples.abstractFactory.cores.interfaces;

/**
 * Interface das classes de "cor". O factory "CorFactory" retornará objetos que implementam essa interface
 */
public interface ICor {
    //Cada implementação do método "preencher" retornará uma string informando um detalhe da classe implementadora
    void preencher();
}
