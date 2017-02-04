package com.examples.observer;

/**
 * Created by ricardo on 2/4/17.
 */
public class SistemaAlarme {

    private java.util.Vector listeners = new java.util.Vector();

    public void registrar( IAlarme obj ) { listeners.addElement( obj ); }

    public void dispararAlarme() {
        for (java.util.Enumeration e=listeners.elements(); e.hasMoreElements(); )
            ((IAlarme)e.nextElement()).alarme();
    }
}
