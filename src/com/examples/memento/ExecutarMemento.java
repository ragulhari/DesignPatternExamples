package com.examples.memento;

/**
 * Created by ricardo on 2/10/17.
 */
public class ExecutarMemento {

    public static void go(){

        GameSaveControl gameSaveControl = new GameSaveControl();
        Savepoint sv = new Savepoint();

        gameSaveControl.setState("Savepoint atualizado #1");
        gameSaveControl.setState("Savepoint atualizado #2");
        System.out.println("Armazenando savepoint #2 em Memento");
        sv.add(gameSaveControl.saveStateToMemento());

        gameSaveControl.setState("Savepoint atualizado #3");
        System.out.println("Armazenando savepoint #3 em Memento");
        sv.add(gameSaveControl.saveStateToMemento());

        gameSaveControl.setState("Cache atualizado #4");
        System.out.println("Savepoint atual: " + gameSaveControl.getState());

        gameSaveControl.getStateFromMemento(sv.get(0));
        System.out.println("Primeiro save: " + gameSaveControl.getState());
        gameSaveControl.getStateFromMemento(sv.get(1));
        System.out.println("Segundo save: " + gameSaveControl.getState());
    }

}
