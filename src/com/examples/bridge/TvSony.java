package com.examples.bridge;

import com.examples.bridge.interfaces.ITv;


/**
 * Essa é a implementação da TV Sony. Ao contrário do exemplo da TV Philips, implementamos aqui
 * um controle básico de stand by, ao invés de registrar diretamente o desligamento. Isso para
 * demonstrar que o comportamento de cada implementação não interfere na operação do controle remoto.
 * Todas as operações geram uma mensagem na console para que seja possível acompanhar o andamento.
 */
public class TvSony implements ITv {

    /*Para demonstrar a navegação entre canais, estamos assumindo um canal padrão para a TV. No caso,
    o canal padrão é o 3
    Além disso, temos a variável standby para abstrair uma situação de controle de stand by da TV.
    */
    private boolean standby = true;
    private int canalPadrao = 3;

    public int ligar(){
        if (standby) {
            standby = false;
            System.out.println("ITv Sony sendo ligada a partir do standby");

            /*Executa todas as operações internas da TV para ligar o canal e devolve o canal padrão da TV*/
            return canalPadrao;

        }
        else
            System.out.println("ITv Sony já está ligada");

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

