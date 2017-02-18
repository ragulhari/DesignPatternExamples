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
        System.out.println(imagem.getResolution());

        //Imagem não será carregada do disco
        imagem.display();

        IImagem imagem2 = new ImagemProxy("test_10mb.jpg", 1920, 1080);

        //Usa o metadado antes do carregamento da imagem
        System.out.println(imagem2.getResolution());

        //Imagem será carregada do disco
        imagem2.display();
        System.out.println("");

        //Usa o metadado após o carregamento da imagem
        System.out.println(imagem2.getResolution());

        //Imagem não será carregada do disco
        imagem2.display();

    }
}
