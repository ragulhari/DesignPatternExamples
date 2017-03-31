package com.examples.iterator;

/**
 * Classe inicial do exemplo.
 *
 * O padrão Iterator tem o objetivo de implementar um mecanismo de iteração em objetos complexos. No nosso
 * exemplo, criamos uma classe base "Valor". Essa classe contém dados básicos e serão tratados por meio de
 * um objeto "Iterator".
 *
 * A classe "Iterator" implementa controles básicos de como navegar por meio de um conjunto de valores. As
 * principais funções básicas de uma rotina de iteração (ir para o próximo, voltar, ir ao primeiro, ir ao
 * último, verificar se chegou ao fim do iterador, adicionar item) são implementados, permitindo-se utilizar
 * regras de negócio complexas para cada uma dessas operações.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaIterator {
    public static void go() {

        //Declaramos o objeto iterador e todos os valores que serão incluídos neste objeto.
        Iterator it = new Iterator();
        it.add(new Valor(19, "João"));
        it.add(new Valor(44, "Maria"));
        it.add(new Valor(92, "André"));
        it.add(new Valor(76, "Joaquim"));
        it.add(new Valor(85, "Lucas"));
        it.add(new Valor(01, "Mário"));

        try {

            /*Abaixo temos uma série de operações utilizando o iterador. Na sequência:
            * 1. Exibe o primeiro item do iterador
            * 2. Avança dois itens no iterador
            * 3. Mostra o terceiro item
            * 4. Volta um item
            * 5. Exibe o segundo item
            * 6. Mostra um item específico (indice 5)
            * 7. Executa uma passagem por todos os itens a partir do item atual (segundo item)
            * */
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
