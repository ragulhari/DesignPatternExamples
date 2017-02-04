package com.examples.observer;

/**
 * Created by ricardo on 2/4/17.
 */
public class SensorLuzes implements IAlarme{

    @Override
    public void alarme() {
        System.out.println("Sensor de luzes ligado");
    }
}
