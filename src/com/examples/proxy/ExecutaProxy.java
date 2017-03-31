package com.examples.proxy;

import com.examples.proxy.interfaces.IImagem;

/**
 * Classe inicial do exemplo.
 *
 * O exemplo apresenta a implementação de proxy de imagens. Existe uma classe responsável por manipular
 * diretamente as imagens (ImagemReal) e uma classe que serve de proxy para a imagem real, chamada ImagemProxy.
 * Este tipo de proxy pode ser pensado como um proxy remoto (por exemplo, imaginando que as duas classes
 * podem atuar em locais diferentes) ou um proxy de proteção.
 *
 * O exemplo carrega a imagem através de imagemProxy e executa diversas operações nele para demonstrar a
 * utilização do proxy.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaProxy {
    public static void go() {
        IImagem imagem = new ImagemProxy("test_10mb.jpg");

        //Imagem será carregada do disco
        imagem.display();
        System.out.println("");
        System.out.println(imagem.getResolution());

        /*Imagem não será recarregada do disco, uma vez que já foi previamente carregada. O proxy gerencia
        esse item.
        */
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
