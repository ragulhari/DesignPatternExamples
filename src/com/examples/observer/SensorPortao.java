package com.examples.observer;

import com.examples.observer.interfaces.IAlarme;

/**
 * A classe SensorPortao é um dos componentes do Alarme. O método "alarme", implementado de IAlarme,
 * executa a ação quando o alarme é disparado (notificado pelo observador).
 */
public class SensorPortao implements IAlarme {

    @Override
    public void alarme() {
        System.out.println("Portão travado.");
    }
}
