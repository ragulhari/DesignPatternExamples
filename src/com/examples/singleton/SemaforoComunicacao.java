package com.examples.singleton;

/**
 * A classe SemaforoComunicacao é a que representa o Singleton no nosso exemplo. O método "getObjeto"
 * verifica se o objeto já foi criado e, caso afirmativo, retorna a mesma instância já criada. Dessa
 * forma se garante que apenas uma única instância é criada.
 */
public class SemaforoComunicacao {
    //Caso o construtor seja private, como no exemplo, podemos tornar essa classe uma "final".
    //Isso é vantajoso porque o compilador aplica otimizações de performance nesse tipo de classe
    
    //Correção de nível de acesso do objeto Singleton
    private static SemaforoComunicacao objeto = null;
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
    
    /*O método getObjeto é o responsável por gerenciar as instâncias, retornando a instância criada
    caso a mesma já exista.*/
    public static SemaforoComunicacao getObjeto()
    {
        if (objeto == null)
        {
            objeto = new SemaforoComunicacao();
        }
        
        return objeto;
    }


    //Esse método abstrai uma conexão a um servidor, para fins de exemplo
    public void conectar(){

        numConexoes += 1;
    }
}
