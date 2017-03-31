package com.examples.observer;

import com.examples.observer.interfaces.IAlarme;

/**
 * A classe SistemaAlarme é o Observer do nosso exemplo, ela é a responsável por registrar todos os
 * componentes em uma lista e, caso haja a mudança de status no sistema (método dispararAlarme), percorre
 * toda a lista de componentes executando as operações padrão definidas na interface IAlarme.
 */
public class SistemaAlarme {

    private java.util.Vector listeners = new java.util.Vector();

    //responsável por registrar o objeto no vetor de listeners
    public void registrar( IAlarme obj ) { listeners.addElement( obj ); }

    /*Esse método essencialmente percorre o vetor de listeners e executa o método "alarme" que é o
     responsável por executar a ação quando da mudança de status.*/
    public void dispararAlarme() {
        for (java.util.Enumeration e=listeners.elements(); e.hasMoreElements(); )
            ((IAlarme)e.nextElement()).alarme();
    }
}
