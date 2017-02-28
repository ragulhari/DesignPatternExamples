package com.examples.visitor.interfaces;

import com.examples.visitor.Computador;
import com.examples.visitor.Monitor;
import com.examples.visitor.Mouse;
import com.examples.visitor.Teclado;

/**
 * Created by ricardo on 2/28/17.
 */
public interface PerifericoVisitor {
    void visitar(Computador computador);
    void visitar(Mouse mouse);
    void visitar(Teclado teclado);
    void visitar(Monitor monitor);
}
