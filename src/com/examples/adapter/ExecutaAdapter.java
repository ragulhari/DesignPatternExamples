package com.examples.adapter;

/**
 * Classe inicial do exemplo.
 *
 * Sobre o exemplo:
 *
 *      O exemplo é baseado em uma conta corrente. A classe "ContaCorrente" contém um conjunto de
 *      operações principais, como exibir saldo ou buscar lançamentos por filtros, como ID ou data.
 *      Para fins de exemplo, a classe "ContaCorrente" pode ser considerada legada e não pode ter
 *      inclusão de novos métodos.
 *
 *      Cada classe "ContaCorrente" possui um ou mais "Lancamentos". O lancamento é uma classe
 *      que contém apenas propriedades básicas, como data, descrição e valor.
 *
 *      O exemplo consiste na adição de duas novas operações à conta corrente, adaptando a classe
 *      "ContaCorrente" por meio de uma nova classe Adapter. Foram implementadas duas abordagens,
 *      uma adaptação de classe ("AdapterClassType") e uma adaptação de objeto ("AdapterObjectType").
 *      As operações em questão são a execução do Extrato dos últimos 12 lançamentos e o
 *      histórico de saldos.
 *
 * @author Ricardo D. Agulhari
 * Janeiro/2017
 */
public class ExecutaAdapter {
    public static void go() {
        TesteAdapter testeAdapter = new TesteAdapter();
        System.out.println("--------Iniciando teste com adapter do tipo classe-------");
        testeAdapter.iniciarClassTypeTest();
        System.out.println("---------------------------------------------------------");
        System.out.println("--------Iniciando teste com adapter do tipo objeto-------");
        testeAdapter.iniciarObjectTypeTest();
        System.out.println("---------------------------------------------------------");
    }
}
