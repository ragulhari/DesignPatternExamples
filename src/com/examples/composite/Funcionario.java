package com.examples.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe descreve os comportamentos e propriedades referentes a um funcionário. Definimos as
 * propriedades que descrevem o funcionário (nome, area, salario) e um objeto que contém uma lista
 * dos subordinados
* */

public class Funcionario {
    private String nome;
    private String area;
    private int salario;
    private List<Funcionario> subordinados;

    public Funcionario(String nome, String area, int salario)
    {
        this.nome = nome;
        this.area = area;
        this.salario = salario;
        this.subordinados = new ArrayList<Funcionario>();
    }

    //Método que adiciona um objeto subordinado a um objeto atual
    public void incluirSubordinado(Funcionario func)
    {
        subordinados.add(func);
    }

    /*Método para remoção de subordinados. Para a simplificação do exemplo
    * a única validação é se o funcionário existe.*/
    public void removerSubordinado(Funcionario func)
    {
        if (subordinados.contains(func))
            subordinados.remove(func);
    }

    //Método para retornar a lista de subordinados
    public List<Funcionario> getSubordinados()
    {
        return subordinados;
    }

    /*Implementação particular de um método "toString()" que obtem os dados do funcionário
    * e estrutura a impressão.
    * */
    public String toString() {
        return ("Dados do empregado: [ Nome: " + this.nome +
                ", Área: " + this.area + ", Salário: " + this.salario + "]");
    }


}
