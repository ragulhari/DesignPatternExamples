package com.examples.bridge;

import com.examples.bridge.interfaces.ITv;

/**
 * A classe ControleUniversal estende as operações definidas em controle remoto, adicionando
 * dois novos métodos: proximo e anterior. Esses dois métodos permitirão navegar entre os canais
 * da TV, independente de qual TV seja.
 */

public class ControleUniversal extends ControleRemoto{
    private int canalAtual = 0;

    /*A inicialização da classe exige que o construtor da classe pai seja executado para, em seguida,
    adicionar suas operações. No caso, como essa classe trabalha com navegação entre canais,
    a operação é de obter da TV o canal em que ela está atualmente.*/
    public ControleUniversal(ITv televisao) {
        super(televisao);
        canalAtual = televisao.getCanalAtual();
    }

    //Avança para o próximo canal
    public void proximo()
    {
        canalAtual++;
        televisao.mudarCanal(canalAtual);
    }

    //Retorna para o canal anterior
    public void anterior() {
        canalAtual--;
        televisao.mudarCanal(canalAtual);
    }
}