package com.examples.iterator;

/**
 * Created by ricardo on 2/20/17.
 */
public class ExecutaIterator {
    public static void go() {

        Iterator it = new Iterator();
        it.add(new Valor(19, "João"));
        it.add(new Valor(44, "Maria"));
        it.add(new Valor(92, "André"));
        it.add(new Valor(76, "Joaquim"));
        it.add(new Valor(85, "Lucas"));
        it.add(new Valor(01, "Mário"));

        try {
            System.out.println("Primeiro: " + ((Valor) it.getFirst()).nome);
            it.next();
            it.next();
            System.out.println("Terceiro item: " + ((Valor) it.getCurrentItem()).nome);
            it.last();
            System.out.println("Segundo item: " + ((Valor) it.getCurrentItem()).nome);

            System.out.println("Item numero 5: " + ((Valor) it.get(5)).nome);


            System.out.println("------Executando o loop a partir do item atual----");
            while(!it.isDone()) {
                System.out.println("Atual: " + ((Valor) it.getCurrentItem()).nome);
                it.next();
            }
        }
        catch (NullPointerException err) {
            System.out.println("Erro de null pointer!");
        }

    }
}
