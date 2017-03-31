/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.singleton;

/**
 * A classe Comunicador é a responsável pela execução do exemplo. Ela cria três objetos
 * "SemaforoComunicacao" porém a criação do objeto não se dá pelo uso da clausula "new", mas sim
 * pelo uso do metodo "getObjeto", o que garante o uso de uma única instãncia.
 */
public class Comunicador {
    
    public SemaforoComunicacao conector1;
    public SemaforoComunicacao conector2;
    public SemaforoComunicacao conector3;
    
    public Comunicador()
    {
        //Cria ou recupera a instância criada
        conector1 = SemaforoComunicacao.getObjeto();
        conector2 = SemaforoComunicacao.getObjeto();
        conector3 = SemaforoComunicacao.getObjeto();
    }

    /*O método realizarConexoes simula o uso dos 3 objetos de forma paralela, porém o número de conexões
    * é centralizado, demonstrando o uso do singleton*/
    public void realizarConexoes(){
            
        while(true){
            conector1.conectar();
            System.out.println("Instancia 1, conexao número " + Integer.toString(conector1.numConexoes())) ;
            conector2.conectar();
            System.out.println("Instancia 2, conexao número " + Integer.toString(conector2.numConexoes())) ;
            conector3.conectar();
            System.out.println("Instancia 3, conexao número " + Integer.toString(conector3.numConexoes())) ;
        }
    }
    
}
