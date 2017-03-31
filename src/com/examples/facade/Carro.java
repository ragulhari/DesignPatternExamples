package com.examples.facade;

/**
 * A classe Carro funciona como o Facade do exemplo. Ela abstrai operações das classes internas
 * (TanqueCombustivel, Motor, ParteEletrica e CintoSeguranca) para componentes externos. Essa classe
 * pode ou não ter conhecimento de algumas dependências, o importante é que ela abstraia a outros
 * objetos operações macro.
 */

public class Carro {

    /*
    * Trabalhamos com três operações básicas: Ligar, Desligar e VerificarBateria (essa não utilizada
    * no exemplo), por isso dois objetos são necessários: Motor e ParteEletrica
    * */
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
