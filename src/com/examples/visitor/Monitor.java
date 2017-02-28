package com.examples.visitor;

import com.examples.visitor.interfaces.Periferico;
import com.examples.visitor.interfaces.PerifericoVisitor;

/**
 * Created by ricardo on 2/28/17.
 */
public class Monitor implements Periferico {
    @Override
    public void accept(PerifericoVisitor visitor) {
        visitor.visitar(this);
    }
}
