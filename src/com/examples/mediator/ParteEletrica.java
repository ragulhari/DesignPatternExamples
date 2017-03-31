package com.examples.mediator;

/**
 * A parte elétrica do carro devolve essencialmente se a mesma está habilitada ou não. Por "habilitada"
 * definimos que a carga restante deve estar acima de 5.0. Para fins do exemplo, colocamos no construtor
 * um valor pré-deifnido.
 */

public class ParteEletrica {

    public double cargaRestante;

    public ParteEletrica()
    {
        cargaRestante = 8.0;
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
