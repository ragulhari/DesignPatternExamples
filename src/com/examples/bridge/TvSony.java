package com.examples.bridge;

import com.examples.bridge.interfaces.Tv;

public class TvSony implements Tv {

    private boolean standby = true;
    private int canalPadrao = 3;

    public int ligar(){
        if (standby) {
            standby = false;
            System.out.println("Tv Sony sendo ligada a partir do standby");

            /*Executa todas as operações internas da TV para ligar o canal e devolve o canal padrão da TV*/
            return canalPadrao;

        }
        else
            System.out.println("Tv Sony já está ligada");

        //caso a TV já esteja previamente ligada, retorna 0 para indicar que o canal atual deve ser mantido
        return 0;

    }

    public void desligar(){
        standby = true;
        System.out.println("TV Sony entrando em standby");
    }

    @Override
    public int getCanalAtual() {
        return canalPadrao;
    }

    public void mudarCanal(int channel) {
        System.out.println("TV Sony agora no canal " + channel);
    }
}

