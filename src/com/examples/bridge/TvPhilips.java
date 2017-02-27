package com.examples.bridge;

import com.examples.bridge.interfaces.Tv;

//Concrete Implementor
public class TvPhilips implements Tv {

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