package com.examples.memento;

/**
 * Classe inicial do exemplo.
 *
 * Memento é um padrão que permite armazenar o estado de um objeto para recuperação posterior. O paralelo
 * mais claro para descrever esse padrão são os "saves" de um jogo de videogame. O usuário grava seu status
 * corrente antes de delisgar um jogo para recuperar quando o mesmo retornar.
 *
 * O exemplo abaixo mostra a execução de alguns "saves" e, posteriormente, recuperando o estado do objeto.
 * No caso o objeto GameSavecontrol é o objeto que tem o estado armazenado. A lista de estados é armazenado
 * na classe SavePoint e cada estado é representado por um objeto "Memento".
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutarMemento {

    public static void go(){

        /*GameSaveControl é o objeto que terá o estado controlado pelo exemplo, enquanto Savepoint é a classe
        * que gerencia os estados dos objetos.*/
        GameSaveControl gameSaveControl = new GameSaveControl();
        Savepoint sv = new Savepoint();

        /*Primeira etapa do exemplo é a gravação do savepoint 1 e 2, sendo que apenas o 2 é enviado ao memento*/
        gameSaveControl.setState("Savepoint atualizado #1");
        gameSaveControl.setState("Savepoint atualizado #2");
        System.out.println("Armazenando savepoint #2 em Memento");
        sv.add(gameSaveControl.saveStateToMemento());

        /*Em seguida se armazena o savepoint 3 no memento*/
        gameSaveControl.setState("Savepoint atualizado #3");
        System.out.println("Armazenando savepoint #3 em Memento");
        sv.add(gameSaveControl.saveStateToMemento());

        gameSaveControl.setState("Cache atualizado #4");
        System.out.println("Savepoint atual: " + gameSaveControl.getState());

        /*Por fim se recupera os estados dos saves para exibição*/
        gameSaveControl.getStateFromMemento(sv.get(0));
        System.out.println("Primeiro save: " + gameSaveControl.getState());
        gameSaveControl.getStateFromMemento(sv.get(1));
        System.out.println("Segundo save: " + gameSaveControl.getState());
    }

}
