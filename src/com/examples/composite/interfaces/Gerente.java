package com.examples.composite.interfaces;

import com.examples.composite.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Gerente implements IFuncionario {
    private String nome;
    private String area;
    private int salario;
    private List<IFuncionario> subordinados;

    public Gerente(String nome, String area, int salario)
    {
        this.nome = nome;
        this.area = area;
        this.salario = salario;
        this.subordinados = new ArrayList<>();
    }

    //Método que adiciona um objeto subordinado a um objeto atual
    public void incluirSubordinado(IFuncionario func)
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
    public List<IFuncionario> getSubordinados()
    {
        return subordinados;
    }

    /*Implementação particular de um método "toString()" que obtem os dados do funcionário
    * e estrutura a impressão.
    * */

    @Override
    public String detalharFuncionario() {
        return ("Dados do empregado: [ Nome: " + this.nome +
                ", Área: " + this.area + ", Salário: " + this.salario + ", NumSubordinados: " +
                Integer.toString(this.subordinados.size()) + "]");
    }
}
