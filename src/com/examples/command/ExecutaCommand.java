package com.examples.command;

/**
 * Classe inicial do exemplo.
 *
 * Sobre o exemplo:
 *
 *      O exemplo é baseado em uma ferramenta de compra e venda de produtos.
 *      São disponibilizados três Produtos para compra e venda: Produto1, Produto2 e Produto 3.
 *
 *      Também são disponibilizados dois comandos: VenderProduto (venda) e ReporEstoque (compra).
 *      Conforme o pattern, os dois comandos são objetos que podem ser executados para executar
 *      a compra e venda de produto1, produto2 ou produto3.
 *
 *      Além destas classes, há um sequenciador. O Sequenciador é o responsável por gerenciar
 *      a sequencia de comandos. Nesta classe poderia ser implementado os comandos Undo e Redo,
 *      por exemplo.
 *
 *      A Classe ExecutaCommand existe apenas para simular a execução de uma sequencia de compras
 *      e vendas. O resultado é apresentado como prints no console.
 *
 * @author Ricardo D. Agulhari
 * Fevereiro/2017
 */
public class ExecutaCommand {


    public static void go() {

        Produto produto1;
        Produto produto2;
        Produto produto3;
        VenderProduto venda;
        ReporEstoque reposicao;
        Sequenciador sequencia;

        //Definição dos produtos que compõe Produto1, Produto2 e Produto3
        produto1 = new Produto("Pen Drive", 20.30, 10);
        produto2 = new Produto("Impressora", 275.70, 8);
        produto3 = new Produto("Mouse", 75.10, 15);
        sequencia = new Sequenciador();

        //Prepara a sequencia de comandos para execução
        sequencia.empilharComando(new VenderProduto(produto1, 3));
        sequencia.empilharComando(new ReporEstoque(produto2, 5));
        sequencia.empilharComando(new VenderProduto(produto2, 6));
        sequencia.empilharComando(new VenderProduto(produto1, 4));
        sequencia.empilharComando(new VenderProduto(produto2, 12));
        sequencia.empilharComando(new VenderProduto(produto3, 11));
        sequencia.empilharComando(new ReporEstoque(produto3, 3));

        //Dispara a execução de todos os comandos empilhados
        sequencia.dispararComandos();
    }
}
