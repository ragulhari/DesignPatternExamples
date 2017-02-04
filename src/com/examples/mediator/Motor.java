package com.examples.mediator;

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
