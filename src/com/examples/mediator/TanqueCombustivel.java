package com.examples.mediator;

/**
 * A classe do tanque de combustível possui duas informações, o valume máximo possível e o volume
 * disponível no momento. Os métodos retornam o volume do tanque e se ele está na reserva ou não.
 */
public class TanqueCombustivel {

    public double lVolumeDisponivel = 12.0; //em litros
    public double lVolumeMaximo = 40.0; //em litros

    public TanqueCombustivel() {}

    /*Consideramos o tanque na reserva quando o volume disopnível está abaixo de 1/8
    do volume total do tanque*/
    public boolean tanqueNaReserva() {
        if (lVolumeDisponivel > (lVolumeMaximo / 8))
            return false;
        return true;
    }
}
