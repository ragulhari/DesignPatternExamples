package com.examples.composite;

import java.util.ArrayList;
import java.util.List;

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

    public void incluirSubordinado(Funcionario func)
    {
        subordinados.add(func);
    }

    public void removerSubordinado(Funcionario func)
    {
        if (subordinados.contains(func))
            subordinados.remove(func);
    }

    public List<Funcionario> getSubordinados()
    {
        return subordinados;
    }

    public String toString() {
        return ("Dados do empregado: [ Nome: " + this.nome +
                ", Área: " + this.area + ", Salário: " + this.salario + "]");
    }


}
