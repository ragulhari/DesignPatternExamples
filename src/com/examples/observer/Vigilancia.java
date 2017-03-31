package com.examples.observer;

import com.examples.observer.interfaces.IAlarme;

/**
 * A classe Vigilancia é um dos componentes do Alarme. Esse método é um pouco mais
 * complexo que os outros componentes para demonstrar um outro tip ode interação. Essa
 * classe executa alguns procedimentos de identificação e localização do disparo do alarme, algo
 * um pouco maior que os outros componentes.
 */

public class Vigilancia implements IAlarme {

    @Override
    public void alarme() {
        System.out.println( "Vigilância:" );

        localizar();
        isolar();
        identificar();
    }

    protected void localizar() {
        System.out.println( "   Verificando locais" );
    }
    protected void isolar()  {
        System.out.println( "   Isolar cômodos inseguros" );
    }
    protected void identificar() {
        System.out.println( "   Identificar a fonte" );
    }


}
