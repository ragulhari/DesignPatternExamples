package com.examples.bridge.interfaces;

/**
 * A interface TV define as operações comuns a todas as TVs para o exemplo:
 *  ligar, desligar, retornar canal atual e mudar o canal atual.
 */
public interface ITv {
    int ligar();
    void desligar();
    int getCanalAtual();
    void mudarCanal(int channel);
}
