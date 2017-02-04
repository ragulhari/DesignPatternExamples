package com.examples.singleton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardo
 */
public class SemaforoComunicacao {
    //Caso o construtor seja private, como no exemplo, podemos tornar essa classe uma "final".
    //Isso é vantajoso porque o compilador aplica otimizações de performance nesse tipo de classe
    
    
    public static SemaforoComunicacao objeto = null;
    private int numConexoes = 0;
    
    /*Poderia ser utilizado Protected também, mas classes com o mesmo Package poderiam instanciar novos objetos,
    o que quebra o pattern. Há duas soluções para este caso: construir o construtor como Private (como neste exemplo)
    ou colocar essa classe em um Package específico para ela. A primeira sugestão (uso do Private) não permite que outras
    classes herdem desta. Já o uso do protected permitiria a herança.
    */
    private SemaforoComunicacao()
    {
        
    }
    
    public int numConexoes()
    {
        return numConexoes;
    }
    
    public static SemaforoComunicacao getObjeto()
    {
        if (objeto == null)
        {
            objeto = new SemaforoComunicacao();  //lazy instantiation
        }
        
        return objeto;
    }
    
    
    public void conectar(){

        //Realiza uma conexão a um servidor, por exemplo
        numConexoes += 1;
    }
}
