package com.examples.proxy;

import com.examples.proxy.interfaces.IImagem;

/**
 * Essa classe exemplifica a utilização de um proxy para carregamento de imagens. No método "display",
 * a classe verifica se a imagem já foi carregada uma vez no objeto imagemReal, caso não o tenha feito
 * realiza a carga. Outro aspecto que é válido identificar é que o objeto ImagemProxy pode ser criado de
 * duas formas, sendo uma não recebendo as dimensões previamente e outra recebendo essas dimensões. Neste
 * último caso, ao carregar a imagem em "display", os metadados de tamanho são sobrescritos em relação aos
 * dados passados no construtor
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
