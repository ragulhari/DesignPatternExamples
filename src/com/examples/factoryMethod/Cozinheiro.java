package com.examples.factoryMethod;

import com.examples.factoryMethod.interfaces.IPrato;

/**
 * A classe Cozinheiro implementa o FactoryMethod para a geração de um objeto que implementa a interface
 * IPrato. O método em si é essencialmente um switch, identificando qual o parâmetro passado e devolvendo
 * uma instância da classe solicitada.
 */

public class Cozinheiro {

    public IPrato pedePrato(String tipoPrato){

        if (tipoPrato.equalsIgnoreCase("BIFE"))
            return new Bife();

        if (tipoPrato.equalsIgnoreCase("FRANGO"))
            return new Frango();

        if (tipoPrato.equalsIgnoreCase("PEIXE"))
            return new Peixe();

        return null;

    }
}
