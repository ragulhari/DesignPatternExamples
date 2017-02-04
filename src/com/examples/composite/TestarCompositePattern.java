package com.examples.composite;


public class TestarCompositePattern {

    public TestarCompositePattern() {}

    public void executarTestes() {

        System.out.println("----------Iniciando teste do case 'Funcionarios'-----------");
        testeFuncionario();
        System.out.println("----------Fim do teste do case 'Funcionarios'-----------");
        System.out.println("\n\n----------Iniciando teste do case 'Hierarquia de inimigos Mario Bros'-----------");
        testeMarioBrosInimigos();
        System.out.println("----------Fim do teste do case 'Hierarquia de inimigos Mario Bros'-----------");

    }

    private void testeFuncionario() {
        Funcionario presidente = new Funcionario("Francisco", "Presidência da empresa", 10000);
        Funcionario diretorVendas = new Funcionario("Roberta", "Diretora de Vendas", 8000);
        Funcionario diretorMkt = new Funcionario("Osmair", "Diretor de Marketing", 8000);
        Funcionario vendedor1 = new Funcionario("Janete", "Vendedora", 3000);
        Funcionario vendedor2 = new Funcionario("Claudio", "Vendedor", 3000);
        Funcionario vendedor3 = new Funcionario("Matheus", "Vendedor", 3000);
        Funcionario asssistentemkt1 = new Funcionario("Ana Cláudia", "Assistente de Marketing", 2500);
        Funcionario designer1 = new Funcionario("Jhonny", "Designer", 1800);
        Funcionario designer2 = new Funcionario("Antônio", "Designer", 1800);

        diretorVendas.incluirSubordinado(vendedor1);
        diretorVendas.incluirSubordinado(vendedor2);
        diretorVendas.incluirSubordinado(vendedor3);

        diretorMkt.incluirSubordinado(asssistentemkt1);
        diretorMkt.incluirSubordinado(designer1);
        diretorMkt.incluirSubordinado(designer2);

        presidente.incluirSubordinado(diretorVendas);
        presidente.incluirSubordinado(diretorMkt);

        System.out.println(presidente.toString());
        for (Funcionario diretor: presidente.getSubordinados()) {

            System.out.println("\t" + diretor.toString());

            for (Funcionario func: diretor.getSubordinados())
                System.out.println("\t\t" + func.toString());

        }

    }

    private void testeMarioBrosInimigos()
    {
        Inimigo inimigoBase = new Inimigo("Inimigo Base", 0, 0);
        Inimigo tartaruga = new Inimigo("Tartaruga básica", 2, 1);
        Inimigo tartarugaFogo = new Inimigo("Tartaruga de fogo", 2, 6);
        Inimigo tartarugaVoador = new Inimigo("Tartaruga Voadora", 2, 4);
        Inimigo goomba = new Inimigo("Goomba", 1, 1);
        Inimigo goombaVoador = new Inimigo("Goomba Voador", 1, 3);

        tartaruga.add(tartarugaFogo);
        tartaruga.add(tartarugaVoador);
        goomba.add(goombaVoador);
        inimigoBase.add(tartaruga);
        inimigoBase.add(goomba);

        System.out.println("Hierarquia de inimigos");
        for (Inimigo i: inimigoBase.especializacoes) {

            System.out.println("\t" + i.render());

            for (Inimigo in: i.especializacoes)
                System.out.println("\t\t" + in.render());

        }

    }

}
