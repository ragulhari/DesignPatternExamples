package com.examples.abstractFactory;

import com.examples.abstractFactory.cores.interfaces.ICor;
import com.examples.abstractFactory.formas.Circulo;
import com.examples.abstractFactory.formas.Quadrado;
import com.examples.abstractFactory.formas.Retangulo;
import com.examples.abstractFactory.formas.interfaces.IForma;
import com.examples.abstractFactory.interfaces.IAbstractFactory;

/**
 * Classe que implementa a factory de "Forma" Por implementar "IAbstractFactory", é necessário declarar
 * os métodos de factory de cor e forma, porém o factory de "Cor" retorna nulo.
 * A factory "Forma" retorna um objeto do tipo "IForma" e a definição de qual objeto retornar é
 * feita com base no valor do parâmetro passado para "getForma"
 */
public class FormaFactory implements IAbstractFactory {
    @Override
    public ICor getCor(String cor) {
        return null;
    }

    @Override
    public IForma getForma(String forma) {

        if (forma == null)
            return null;

        if (forma.equalsIgnoreCase("CIRCULO"))
            return new Circulo();

        if (forma.equalsIgnoreCase("QUADRADO"))
            return new Quadrado();

        if (forma.equalsIgnoreCase("RETANGULO"))
            return new Retangulo();

        return null;
    }
}
