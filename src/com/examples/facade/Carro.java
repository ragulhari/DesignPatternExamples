package com.examples.facade;

public class Carro {

    private Motor m;
    private ParteEletrica p;

    public Carro()
    {
        m = new Motor();
        p = new ParteEletrica();
    }

    public String ligar()
    {
        return m.ligar();
    }

    public String desligar()
    {
        return m.desligar();
    }

    public boolean verificarBateria() { return p.cargaBateriaDisponivel();}
}
