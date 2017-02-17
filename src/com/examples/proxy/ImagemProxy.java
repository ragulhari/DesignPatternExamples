package com.examples.proxy;

import com.examples.proxy.interfaces.IImagem;

/**
 * Created by ricardo on 2/17/17.
 */
public class ImagemProxy implements IImagem {

    private ImagemReal imagemReal;
    private String nomeArquivo;

    public ImagemProxy(String arquivo) {
        this.nomeArquivo = arquivo;
    }

    @Override
    public void display() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(this.nomeArquivo);
        }

        imagemReal.display();

    }
}
