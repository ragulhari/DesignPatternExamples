package com.examples.bridge;

import com.examples.bridge.interfaces.Tv;

/**
 * Created by ricardo on 2/27/17.
 */
public abstract class ControleRemoto {
    protected Tv televisao;

    public ControleRemoto(Tv televisao) {
        this.televisao = televisao;
    }

    public void ligar() {
        this.mudarCanal(televisao.ligar());
    }

    public void desligar() {
        televisao.desligar();
    }
    public void mudarCanal(int channel) {
        televisao.mudarCanal(channel);
    }

    public int getCanalAtual()
    {
        return televisao.getCanalAtual();
    }
}