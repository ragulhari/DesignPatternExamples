package com.examples.abstractFactory.formas.interfaces;

/**
 * Interface das classes de "forma". O factory "FormaFactory" retornará objetos que implementam essa interface
 */
public interface IForma {
    //Cada implementação do método "desenhar" retornará uma string informando um detalhe da classe implementadora
    void desenhar();
}
