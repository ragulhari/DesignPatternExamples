package com.examples.composite;

import com.examples.composite.interfaces.IFuncionario;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe descreve os comportamentos e propriedades referentes a um funcionário. Definimos as
 * propriedades que descrevem o funcionário (nome, area, salario) e o método da interface (detalharFuncionario)
 * com o print dos dados do funcionário.
* */

public class Funcionario implements IFuncionario {
    private String nome;
    private String area;
    private int salario;

    Funcionario(String nome, String area, int salario)
    {
        this.nome = nome;
        this.area = area;
        this.salario = salario;
    }

    @Override
    public String detalharFuncionario() {
        return ("Dados do empregado: [ Nome: " + this.nome +
                ", Área: " + this.area + ", Salário: " + this.salario + "]");
    }


}
