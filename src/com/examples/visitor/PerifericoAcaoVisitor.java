package com.examples.visitor;

import com.examples.visitor.interfaces.IPerifericoVisitor;

/**
 * Classe que implementa a visitação de cada um dos componentes para a ação de inicialização.
 * cada um dos métodos "visitar" recebe como parâmetro o componente a ser modificado. No nosso exemplo
 * não fazemos modificações nos objetos, mas o padrão consiste em exatamemente modificar o estado do
 * objeto passado de forma que não é necessário codificar a classe do objeto, mas apenas definir a ação
 * em uma nova classe.
 */
public class PerifericoAcaoVisitor implements IPerifericoVisitor {
    @Override
    public void visitar(Computador computador) {
        System.out.println("Inicializando o computador");
    }

    @Override
    public void visitar(Mouse mouse) {
        System.out.println("Inicializando o mouse");
    }

    @Override
    public void visitar(Teclado teclado) {
        System.out.println("Inicializando o teclado");
    }

    @Override
    public void visitar(Monitor monitor) {
        System.out.println("Inicializando o monitor");
    }
}
