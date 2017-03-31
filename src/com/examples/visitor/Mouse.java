package com.examples.visitor;

import com.examples.visitor.interfaces.IPeriferico;
import com.examples.visitor.interfaces.IPerifericoVisitor;

/**
 * Classe que representa um componente "Mouse" do computador. Há apenas um método implementado. Esse método
 * é responsável pela execução da ação definida no parâmetro passado. Essa operação é denominada visitação.
 */
public class Mouse implements IPeriferico {
    @Override
    public void accept(IPerifericoVisitor visitor) {
        visitor.visitar(this);
    }
}
