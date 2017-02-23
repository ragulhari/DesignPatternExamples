package com.examples.abstractFactory;

import com.examples.abstractFactory.cores.interfaces.ICor;
import com.examples.abstractFactory.formas.interfaces.IForma;
import com.examples.abstractFactory.interfaces.IAbstractFactory;

/**
 * Classe inicial do exemplo.
 *
 * Sobre o exemplo:
 *
 *      O exemplo contém dois factories principais: Um factory para a interface Forma
 *      e outro para a interface Cores. Cada um destes factories tem três tipos de objetos:
 *      Para forma -> circulo, quadrado, retângulo (interface IForma)
 *      Para cores -> azul, verde, vermelho (interface ICor)
 *
 *      Cada factory implementa um Abstract Factory, abstraindo do cliente detalhes como o
 *      tipo de classe específica de cada um dos objetos. Ao invés disso, o cliente precisa
 *      saber utilizar apenas as Factories e os detalhes de geração do objeto é abstraído
 *      dentro de cada factory.
 *
 *      O abstract factory também contempla um "factory de factories", definido na classe
 *      "ClassesFactory". Essa classe retorna no método "getFactory" um factory entre "Forma"
 *      e "Cor". Assim, até a utilização do Factory é abstraído do cliente.
 *
 *      Desta forma, o exemplo apenas executa a criação de uma série de objetos a partir dos
 *      factories, para demonstrar a versatilidade da criação de cada objeto por esse recurso
 *
 *
 * @author Ricardo D. Agulhari
 * Fevereiro/2017
 */
public class ExecutaAbstractFactory {
    public static void go() {
        IAbstractFactory abstractFactory;
        IForma forma;
        ICor cor;

        //Executa o "Factory de Factories" para obter o Factory de forma
        abstractFactory = ClassesFactory.getFactory("FORMA");

        /*
        * Executa a criação de objetos do tipo forma através do factory.
        * Cada invocação tem um parâmetro com o nome do objeto. Internamente
        * o factory resolve e retorna o objeto correspondente.
        * Para cada invocação, executamos o método "desenhar" para demonstrar
        * o objeto instanciado.
        * */
        forma = abstractFactory.getForma("CIRCULO");
        forma.desenhar();

        forma = abstractFactory.getForma("QUADRADO");
        forma.desenhar();

        forma = abstractFactory.getForma("RETANGULO");
        forma.desenhar();

        //Executa o "Factory de Factories" para obter o Factory de cor
        abstractFactory = ClassesFactory.getFactory("COR");


       /*
        * Executa a criação de objetos do tipo cor através do factory.
        * Cada invocação tem um parâmetro com o nome do objeto. Internamente
        * o factory resolve e retorna o objeto correspondente.
        * Para cada invocação, executamos o método "preencher" para demonstrar
        * o objeto instanciado.
        * */
        cor = abstractFactory.getCor("VERMELHO");
        cor.preencher();

        cor = abstractFactory.getCor("VERDE");
        cor.preencher();

        cor = abstractFactory.getCor("AZUL");
        cor.preencher();


    }
}
