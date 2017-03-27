package com.examples.facade;

/**
 * Classe que implementa o motor do carro, bem como as regras de negócio que envolvem ligar e desligar
 * o motor. É a classe que mais tem dependências com outros componentes, como o tanque e a parte elétrica.
 *
 */

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

    /*
    * A operação Ligar possui algumas regras de negócio. Para que o motor seja ligado, a parte elétrica
    * do carro deve estar habilitada (mais sobre issso na classe da parte elétrica)
    * e o tanque de combustível não pode estar na reserva. Caso contrário o motor não será ligado.
    * */
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

    /*
    * Para desligar o carro, a única verificação é de que o motor está ligado.
    * */
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
