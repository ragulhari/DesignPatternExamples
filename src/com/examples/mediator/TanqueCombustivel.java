package com.examples.mediator;

/**
 * Created by root on 1/27/17.
 */
public class TanqueCombustivel {

    public double lVolumeDisponivel = 12.0; //em litros
    public double lVolumeMaximo = 40.0; //em litros

    public TanqueCombustivel() {}

    public String retornarVolumeDisponivel()
    {
        return Double.toString(lVolumeDisponivel);
    }

    public boolean tanqueNaReserva() {
        if (lVolumeDisponivel > (lVolumeMaximo / 8))
            return false;
        return true;
    }
}
