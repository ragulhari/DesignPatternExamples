package com.examples.observer;

/**
 * Classe inicial do exemplo.
 *
 * O padrão Observer tem por objetivo construir um mecanismo de broadcast entre componentes de um sistema
 *  para que, quando há alteração de estado em um deles, os demais possam refletir o impacto dessa alteração
 *  entre si.
 *
 * No nosso exemplo simulamos a interação entre componentes de um sistema de alarme residencial. Cada componente
 * do sistema implementa a interface IAlarme com o método que irá ser executado quando a classe for notificada
 * da alteração. A classe SistemaAlarme é a responsável por manter a relação entre esses componentes, sendo que
 * cada componente deve se registrar ao SistemaAlarme para ser notificado.
 *
 * Após todos os registros serem finalizados simulamos o envio do broadcast por meio do método "dispararAlarme".
 * Ao acontecer essa mudança de estado, cada componente irá reagir de uma forma.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaObserver {
    public static void go() {
        /*Um objeto SistemaAlarme é instanciado e, em seguida, inicia-se o registro dos componentes do
        * sistema de alarme. Em seguida, executa o método "dispararAlarme" para mostrar o efeito do
        * observer em cada componente registrado.*/
        SistemaAlarme ss = new SistemaAlarme();
        ss.registrar( new SensorPortao());
        ss.registrar( new SensorLuzes());
        ss.registrar( new Vigilancia());
        System.out.println("Alarme disparado!!!");
        ss.dispararAlarme();

    }
}
