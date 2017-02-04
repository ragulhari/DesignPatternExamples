package com.examples.mediator;

public class Carro {

    private Motor m;
    private CintoSeguranca c;
    private ParteEletrica p;
    private TanqueCombustivel t;

    public Carro()
    {
        m = new Motor();
        c = new CintoSeguranca();
        p = new ParteEletrica();
        t = new TanqueCombustivel();
    }

    public String ligar()
    {
        if (m.motorLigado())
            return "Motor já está ligado";

        if (c.statusCintoMotorista()) {
            if (p.parteEletricaHabilitada()) {
                if (!t.tanqueNaReserva())
                    m.ligar();
                else
                    return "Não ligado, está faltando combustível";
            }
            return "Não ligado, problema com a bateria";
        }
        return "Não ligado, motorista, por favor afivele o cinto";
    }

    public String desligar()
    {
        m.desligar();
        return "Motor desligado";
    }
}
