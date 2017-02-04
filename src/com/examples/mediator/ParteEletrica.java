package com.examples.mediator;

public class ParteEletrica {

    public double cargaRestante;

    public ParteEletrica()
    {
        cargaRestante = 4.0;
    }

    public boolean parteEletricaHabilitada()
    {
        if (cargaBateriaDisponivel())
            return true;

        return false;
    }

    private boolean cargaBateriaDisponivel()
    {
        if (cargaRestante > 5.0)
            return true;
        else
            return false;
    }

}
