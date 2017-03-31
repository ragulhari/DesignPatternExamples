package com.examples.bridge;

import com.examples.bridge.interfaces.ITv;

/**
 * Classe que implementa algumas das operações comuns a todos os controles. A declaração da
 * variável "televisao" caracteriza a bridge. Não importa a implementação de TV, todos os controles
 * remotos que estenderem essa classe funcionarão. O contrário também é verdae.
 */
public abstract class ControleRemoto {
    protected ITv televisao;

    public ControleRemoto(ITv televisao) {
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

    //O método getCanalAtual tem o objetivo de apenas retornar o canal em que a TV está sintonizada.
    public int getCanalAtual()
    {
        return televisao.getCanalAtual();
    }
}