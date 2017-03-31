package com.examples.chainOfResponsibility.interfaces;

/**
 * Define os métodos que devem ser contidos em uma dispensadora. Serão considerados dois métodos:
 *  definirProximoDacadeia -> Método que recebe a dispensadora que será executada após a operação da dispensadora atual;
 *  sacarDinheiro -> Metodo que, de fato, implementa a operação de saque
 */
public interface Dispensadora {

    void definirProximoDaCadeia(Dispensadora d);

    void sacarDinheiro(int quantidade);

}
