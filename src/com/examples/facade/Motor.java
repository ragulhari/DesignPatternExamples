package com.examples.facade;

public class Motor {

    private boolean motorLigado = false;
    private ParteEletrica parteEletrica;
    private TanqueCombustivel tanque;

    public Motor()
    {
        motorLigado = false;
        parteEletrica = new ParteEletrica();
        tanque = new TanqueCombustivel();

    }

    public String ligar()
    {
        if (motorLigado)
            return "Motor já está ligado";
        else
        {
            if (parteEletrica.parteEletricaHabilitada() && !tanque.tanqueNaReserva())
                motorLigado = true;
            else
                return "Motor não ligado. Motorista, verifique a parte elétrica, combustível e bateria e tente ligar novamente.";

        }

        return "Motor ligado!";

    }

    public String desligar()
    {
        if (motorLigado == false)
            return "Motor não estava ligado.";

        motorLigado = false;
        return "Motor foi desligado";
    }

    public boolean motorLigado(){
        return motorLigado;
    }
}
