package com.examples.chainOfResponsibility.interfaces;

/**
 * Created by ricardo on 2/21/17.
 */
public interface Dispensadora {

    void definirProximoDaCadeia(Dispensadora d);

    void sacarDinheiro(int quantidade);

}
