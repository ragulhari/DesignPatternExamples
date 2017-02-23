package com.examples.abstractFactory;

import com.examples.abstractFactory.cores.Azul;
import com.examples.abstractFactory.cores.Verde;
import com.examples.abstractFactory.cores.Vermelho;
import com.examples.abstractFactory.cores.interfaces.ICor;
import com.examples.abstractFactory.formas.interfaces.IForma;
import com.examples.abstractFactory.interfaces.IAbstractFactory;

/**
 * Classe que implementa a factory de "Cor" Por implementar "IAbstractFactory", é necessário declarar
 * os métodos de factory de cor e forma, porém o factory de "Forma" retorna nulo.
 * A factory "Cor" retorna um objeto do tipo "ICor" e a definição de qual objeto retornar é
 * feita com base no valor do parâmetro passado para "getCor"
 */
public class CorFactory implements IAbstractFactory {
    @Override
    public ICor getCor(String cor) {
        if (cor == null)
            return null;

        if (cor.equalsIgnoreCase("VERMELHO"))
            return new Vermelho();

        if (cor.equalsIgnoreCase("VERDE"))
            return new Verde();

        if (cor.equalsIgnoreCase("AZUL")) {
            return new Azul();
        }

        return null;

    }

    @Override
    public IForma getForma(String forma) {
        return null;
    }
}
