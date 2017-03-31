package com.examples.mediator;

/**
 * A classe motor contém apenas seu status (se está ligado ou não). Os métodos apenas atribuem os status
 * e devolvem o status para uso pelas outras classes.
 */
public class Motor {

    private boolean motorLigado = false;

    public Motor()
    {
        motorLigado = false;
    }

    public void ligar()
    {
        motorLigado = true;

    }

    public void desligar()
    {
        motorLigado = false;
    }

    public boolean motorLigado(){
        return motorLigado;
    }
}
