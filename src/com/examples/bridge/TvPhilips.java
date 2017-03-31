package com.examples.bridge;

import com.examples.bridge.interfaces.ITv;

/**
 * Essa é a implementação da TV Philips. Para fins de exemplo consideramos que as ações realizadas
 * são bem simplificadas, não havendo uma tratativa de stand by, por exemplo. Todas as operações
 * geram uma mensagem na console para que seja possível acompanhar o andamento.
 */
public class TvPhilips implements ITv {

    /*Para demonstrar a navegação entre canais, estamos assumindo um canal padrão para a TV. No caso,
    o canal padrão é o 12*/
    private int canalPadrao = 12;

    public int ligar(){
        System.out.println("TV Philips ligada");
        return canalPadrao;
    }

    public void desligar(){
        System.out.println("TV Philips desligada");
    }

    @Override
    public int getCanalAtual() {
        return canalPadrao;
    }

    public void mudarCanal(int channel)
    {
        System.out.println("TV Philips agora no canal " + channel);
    }
}