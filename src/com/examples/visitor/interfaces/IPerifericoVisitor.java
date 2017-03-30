package com.examples.visitor.interfaces;

import com.examples.visitor.Computador;
import com.examples.visitor.Monitor;
import com.examples.visitor.Mouse;
import com.examples.visitor.Teclado;

/**
 * Definição da interface que deve ser implementada por cada ação. Todas as ações devem implementar seu
 * código na mesma classe para cada componente. Essa ação será visitada pelos componentes conforme demandado.
 */
public interface IPerifericoVisitor {
    void visitar(Computador computador);
    void visitar(Mouse mouse);
    void visitar(Teclado teclado);
    void visitar(Monitor monitor);
}
