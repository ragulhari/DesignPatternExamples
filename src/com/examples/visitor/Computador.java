package com.examples.visitor;

import com.examples.visitor.interfaces.IPeriferico;
import com.examples.visitor.interfaces.IPerifericoVisitor;

/**
 * A classe Computador é um pouco mais complexa que os outros componentes que também implementam IPeriferico,
 * pois ela é o agregador de todos os componentes. Assim, na sua instanciação, ele define a dependência dos
 * objetos Teclado, Mouse e Monitor e, no seu metodo accept, além de visitar a ação passada, ele executa um
 * "for" para visitar a ação passada para cada componente.
 */
public class Computador implements IPeriferico {

    //No construtor da classe definimos cada um dos componentes que compõem o computador.
    IPeriferico[] componentes;
    public Computador() {
        componentes = new IPeriferico[] {new Mouse(), new Teclado(), new Monitor()};
    }

    //No seu método accept, ele além de visitar sua ação, coordena a visitação de cada um dos componentes.
    @Override
    public void accept(IPerifericoVisitor visitor) {
        for (int i=0; i < componentes.length; i++){
            componentes[i].accept(visitor);
        }

        visitor.visitar(this);
    }
}
