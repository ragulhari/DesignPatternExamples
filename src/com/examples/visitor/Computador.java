package com.examples.visitor;

import com.examples.visitor.interfaces.Periferico;
import com.examples.visitor.interfaces.PerifericoVisitor;

/**
 * Created by ricardo on 2/28/17.
 */
public class Computador implements Periferico {

    Periferico[] componentes;

    public Computador() {
        componentes = new Periferico[] {new Mouse(), new Teclado(), new Monitor()};
    }

    @Override
    public void accept(PerifericoVisitor visitor) {
        for (int i=0; i < componentes.length; i++){
            componentes[i].accept(visitor);
        }

        visitor.visitar(this);
    }
}
