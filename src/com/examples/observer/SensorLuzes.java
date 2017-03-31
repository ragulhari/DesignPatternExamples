package com.examples.observer;

import com.examples.observer.interfaces.IAlarme;

/**
 * A classe SensorLuzes é um dos componentes do Alarme. O método "alarme", implementado de IAlarme,
 * executa a ação quando o alarme é disparado (notificado pelo observador).
 */
public class SensorLuzes implements IAlarme {

    @Override
    public void alarme() {
        System.out.println("Sensor de luzes ligado");
    }
}
