package com.examples.bridge;

import com.examples.bridge.interfaces.Tv;

public class ControleUniversal extends ControleRemoto{
    private int canalAtual = 0;

    public ControleUniversal(Tv televisao) {
        super(televisao);
        canalAtual = televisao.getCanalAtual();
    }

    public void proximo()
    {
        canalAtual++;
        televisao.mudarCanal(canalAtual);
    }

    public void anterior() {
        canalAtual--;
        televisao.mudarCanal(canalAtual);
    }
}