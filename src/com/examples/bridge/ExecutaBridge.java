package com.examples.bridge;

import com.examples.bridge.interfaces.ITv;

/**
 * Classe inicial do exemplo.
 *
 * O exemplo contém uma implementação básica de um bridge, abstraindo para isso a implementação
 * de um controle remoto universal para TVs. Definimos uma interface ITv que indica operações básicas
 * que todas as televisões executam (ligar, desligar, exibir canal atual e mudar o canal) e duas
 * implementações de televisão (Philips e Sony, por exemplo). Cada uma delas implementa de forma diferente
 * essas operações. Por exemplo, uma delas implementa o stand by ao invés de desligar de vez.
 *
 * Em paralelo a essa estrutura de TVs, há a estrutura de Controle Remoto. Temos uma classe abstrata
 * "ControleRemoto" que implementa algumas operações básicas de operações relacionadas à interface ITv.
 * Neste caso, essa relação entre ITv e ControleRemoto é nossa bridge.
 *
 * Em seguida fazemos uma implementação concreta do controle remoto pela classe "ControleUniversal"
 * estendendo as implementações de ControleRemoto. Para as classes de controle remoto não importa a
 * implementação de TVs; ela executa suas próprias operações de forma independente. O que liga TV e
 * controle remoto é a Bridge estabelecida entre ITv e ControleRemoto.
 *
 * @author Ricardo D. Agulhari
 * Fevereiro/2017
 */
public class ExecutaBridge {

    public static void go()
    {
        ITv tvSony = new TvSony();
        ITv tvPhilips = new TvPhilips();

        /*Criamos duas instancias de controle remoto, uma para cada TV. A TV relacionada é passada
        como parâmetro.*/
        ControleUniversal controlSony = new ControleUniversal(tvSony);
        ControleUniversal controlPhilips = new ControleUniversal(tvPhilips);

        controlSony.ligar();
        controlSony.proximo();
        controlSony.proximo();
        controlSony.desligar();

        controlPhilips.ligar();
        controlPhilips.anterior();
        controlPhilips.anterior();
        controlPhilips.desligar();

    }
}
