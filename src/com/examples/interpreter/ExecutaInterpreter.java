package com.examples.interpreter;

import com.examples.interpreter.interfaces.IExpressao;

/**
 * O padrão Interpreter está ligado a identificar e interpretar sentenças gramaticais. No nosso exemplo
 * nós fazemos associações de informações relacionados a times de futebol, fazendo perguntas e recebendo
 * retornos "true" ou "false".
 *
 * A classe ExecutaInterpreter constrói as relações entre os objetos gramaticais utilizando expressões AND,
 * OR e TERMINAIS (cada uma implementada como classes). A classe TERMINAL representa o elemento atômico de
 * uma sentença (uma palavra, por exemplo) enquanto as classes que implmentam AND e OR usam associações com
 * elementos terminais para determinar se uma sentença é verdadeiro ou falso.
 */
public class ExecutaInterpreter {

    /*
    * O método abaixo utiliza a expressão OR para identificar o conjunto de objetos que pertencem a um grupo
    * (no caso times paulistas). Quando perguntado, o sistema percorrerá essa lista para identificar se um
    * dos elementos cadastrados confere com o elemento perguntado e devolverá "true" caso seja encontrado.
    * Este método retorna um IExpressao a ser interpretada elas classes que implementam expressão.
    * */
    public static IExpressao IdentificarTimesPaulistas() {
        IExpressao palmeiras = new ExpressaoTerminal("Palmeiras");
        IExpressao corinthians = new ExpressaoTerminal("Corinthians");

        return new ExpressaoOr(palmeiras, corinthians);
    }

    /*
    * O método abaixo utiliza a expressão AND para identificar a associação de objetos. Caso a associação
    * entre os elementos seja encontrado é retornado o valor "True". Caso contrário, retorna "false". Como todas
    * as expressões, esse método retorna um IExpressao a ser interpretada elas classes que implementam expressão.
    * */
    public static IExpressao IdentificarCampeao() {
        IExpressao saopaulo = new ExpressaoTerminal("São Paulo");
        IExpressao campeao = new ExpressaoTerminal("mundial");

        return new ExpressaoAnd(saopaulo, campeao);
    }


    public static void go() {
        /*O método instancia os dois tipos de análises que serão feitas, em seguida inicia uma lista de
        perguntas para que sejam analisadas e devolvida a resposta "true" ou "false".
        */
        IExpressao time = IdentificarTimesPaulistas();
        IExpressao campeao = IdentificarCampeao();

        System.out.println("Palmeiras é um time paulista? " + time.interpretar("Palmeiras"));
        System.out.println("Corinthians é um time paulista? " + time.interpretar("Corinthians"));
        System.out.println("Flamengo é um time paulista? " + time.interpretar("Flamengo"));
        System.out.println("São Paulo tem Mundial? " + campeao.interpretar("São Paulo mundial"));
        System.out.println("Palmeiras tem Mundial? " + campeao.interpretar("Palmeiras mundial"));
    }

}
