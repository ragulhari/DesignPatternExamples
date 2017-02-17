package com.examples.proxy;

import com.examples.proxy.interfaces.IImagem;

/**
 * Created by ricardo on 2/17/17.
 */
public class ExecutaProxy {
    public static void go() {
        IImagem imagem = new ImagemProxy("test_10mb.jpg");

        //Imagem será carregada do disco
        imagem.display();
        System.out.println("");

        //Imagem não será carregada do disco
        imagem.display();
    }
}
