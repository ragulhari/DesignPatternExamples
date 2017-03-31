package com.examples.visitor;

import com.examples.visitor.interfaces.IPerifericoVisitor;

/**
 * Classe que implementa a visitação de cada um dos componentes para a ação de verificação de status.
 * cada um dos métodos "visitar" recebe como parâmetro o componente a ser modificado. No nosso exemplo
 * não fazemos modificações nos objetos, mas o padrão consiste em exatamemente modificar o estado do
 * objeto passado de forma que não é necessário codificar a classe do objeto, mas apenas definir a ação
 * em uma nova classe.
 */
public class VerificaStatusComponenteVisitor implements IPerifericoVisitor {
    @Override
    public void visitar(Computador computador) {
        System.out.println("Computador verificado");
        System.out.println("Existem " + computador.componentes.length + " componentes conectados");
    }

    @Override
    public void visitar(Mouse mouse) {
        System.out.println("Mouse conectado ao computador");
    }

    @Override
    public void visitar(Teclado teclado) {
        System.out.println("Teclado conectado ao computador");
    }

    @Override
    public void visitar(Monitor monitor) {
        System.out.println("Monitor conectado ao computador");
    }
}
