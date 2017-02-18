package com.examples.proxy;

import com.examples.proxy.interfaces.IImagem;

/**
 * Created by ricardo on 2/17/17.
 */
public class ImagemProxy implements IImagem {

    private ImagemReal imagemReal;
    private String nomeArquivo;
    private int width = 0;
    private int height = 0;


    public ImagemProxy(String arquivo) {
        this.nomeArquivo = arquivo;
    }


    public ImagemProxy(String arquivo, int width, int height) {
        this.nomeArquivo = arquivo;
        this.width = width;
        this.height = height;
    }

    @Override
    public void display() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(this.nomeArquivo, width, height);
            this.width = imagemReal.getWidth();
            this.height = imagemReal.getHeight();
        }

        imagemReal.display();

    }

    @Override
    public String getResolution() {
        return Integer.toString(width) + "x" + Integer.toString(height);
    }
}
