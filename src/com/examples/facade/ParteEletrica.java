package com.examples.facade;

/**
 * Classe que implementa a parte elétrica do carro, bem como as regras de negócio que envolvem ligar e desligar
 * o carro. A parte elétrica possui algumas regras para cada uma das operações e envolve a verificação do cinto
 * de segurança.
 */


public class ParteEletrica {


    //A parte elétrica, para o exemplo, verificamos o nível da carga da bateria e o cinto de segurança.
    public double cargaRestante;
    public CintoSeguranca cintoMotorista;

    /* O valor de cargaRestante é apenas uma abstração apra o exemplo, em uma situação real teria algum
    sensor, por exemplo, que devolveria o valor*/
    public ParteEletrica()
    {
        cargaRestante = 56.0;
        cintoMotorista = new CintoSeguranca();
    }

    /* Para a regra de negócio, a parte elétrica é considerada habilitada se a carga da bateria está
    * disponível (para o exemplo, isso acontece quando a carga da bateria tem valor maior que 5)
    *  e o cinto de segurança está atado.
    * */
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
