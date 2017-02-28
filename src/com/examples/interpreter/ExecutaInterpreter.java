package com.examples.interpreter;

import com.examples.interpreter.interfaces.Expressao;

/**
 * Created by ricardo on 2/28/17.
 */
public class ExecutaInterpreter {

    public static Expressao IdentificarTimesPaulistas() {
        Expressao palmeiras = new ExpressaoTerminal("Palmeiras");
        Expressao corinthians = new ExpressaoTerminal("Corinthians");

        return new ExpressaoOr(palmeiras, corinthians);
    }

    public static Expressao IdentificarCampeao() {
        Expressao saopaulo = new ExpressaoTerminal("São Paulo");
        Expressao campeao = new ExpressaoTerminal("campeão");

        return new ExpressaoAnd(saopaulo, campeao);
    }


    public static void go() {
        Expressao time = IdentificarTimesPaulistas();
        Expressao campeao = IdentificarCampeao();

        System.out.println("Palmeiras é um time paulista? " + time.interpretar("Palmeiras"));
        System.out.println("Corinthians é um time paulista? " + time.interpretar("Corinthians"));
        System.out.println("Flamengo é um time paulista? " + time.interpretar("Flamengo"));
        System.out.println("São Paulo é o campeão? " + campeao.interpretar("São Paulo campeão"));
        System.out.println("Santos é campeão? " + campeao.interpretar("Santos campeão"));
    }

}
