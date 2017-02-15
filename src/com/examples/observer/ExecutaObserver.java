package com.examples.observer;

/**
 * Created by ricardo on 2/14/17.
 */
public class ExecutaObserver {
    public static void go() {
        SistemaAlarme ss = new SistemaAlarme();
        ss.registrar( new SensorPortao());
        ss.registrar( new SensorLuzes());
        ss.registrar( new Vigilancia());
        System.out.println("Alarme disparado!!!");
        ss.dispararAlarme();

    }
}
