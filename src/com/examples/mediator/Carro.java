package com.examples.mediator;

/**
 * A classe "Carro" é a mediadora entre todos os componentes e os utiliza, conforme as regras de negócio,
 * para realizar as operações. Essa classe contém uma instância de cada um dos componentes e os métodos
 * "ligar" e "desligar" executam todas as regras de negócio necessárias para executar as operações.
 * */

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

    /*
    * Na nossa regra, o método "ligar" verifica o status do cinto de segurança (se está atado), se a parte
    * elétrica está habilitada (a definição de habilitada pode ser encontrada dentro da classe ParteEletrica)
    * e se o tanque não está na reserva. Se essas condições estiverem satisfeitas, o motor é ligado
    * */
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

    /*
    * O método delisgar simplesmente delisga o motor, sem verificação de regras.
    * */
    public String desligar()
    {
        m.desligar();
        return "Motor desligado";
    }
}
