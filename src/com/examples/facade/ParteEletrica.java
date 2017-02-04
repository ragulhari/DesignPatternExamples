package com.examples.facade;

public class ParteEletrica {

    public double cargaRestante;
    public CintoSeguranca cintoMotorista;

    public ParteEletrica()
    {
        cargaRestante = 56.0;
        cintoMotorista = new CintoSeguranca();
    }

    public boolean parteEletricaHabilitada()
    {
        if (cargaBateriaDisponivel() && cintoMotorista.statusCintoMotorista())
            return true;

        return false;
    }

    public boolean cargaBateriaDisponivel()
    {
        if (cargaRestante > 5.0)
            return true;
        else
            return false;
    }

}
