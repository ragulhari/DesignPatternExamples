package com.examples.facade;

/**
 * Classe que implementa "sensores" do tanque de combustível. Para fim de exemplo são dos sensores,
 * um do volume atual, outro do volume máximo do tanque. Essa classe executa apenas uma checagem,
 * se o tanque está ou não na reserva.
 */
public class TanqueCombustivel {

    //Os valores dos dois sensores foram definidos para o exemplo, apenas.
    public double lVolumeDisponivel = 12.0; //em litros
    public double lVolumeMaximo = 40.0; //em litros

    /*Esse método executa o calculo se o volume atual correponde a, no máximo, 1/8 do tanque. Caso essa
    * afirmação seja verdadeira, significa que o tanque está na reserva*/
    public boolean tanqueNaReserva() {
        if (lVolumeDisponivel > (lVolumeMaximo / 8))
            return false;
        return true;
    }
}
