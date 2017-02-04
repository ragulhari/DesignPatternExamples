/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.singleton;

/**
 *
 * @author ricardo
 */
public class Comunicador {
    
    public SemaforoComunicacao conector1;
    public SemaforoComunicacao conector2;
    public SemaforoComunicacao conector3;
    
    public Comunicador()
    {
        conector1 = SemaforoComunicacao.getObjeto();
        conector2 = SemaforoComunicacao.getObjeto();
        conector3 = SemaforoComunicacao.getObjeto();
    }

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
