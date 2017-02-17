package com.examples.proxy;

import com.examples.proxy.interfaces.IImagem;

/**
 * Created by ricardo on 2/17/17.
 */
public class ImagemReal implements IImagem {

    private String nomeArquivo;

    public ImagemReal(String arquivo){
        this.nomeArquivo = arquivo;
        loadFromDisk(arquivo);
    }
    @Override
    public void display() {
        System.out.println("Exibindo o arquivo " + nomeArquivo);
    }


    private void loadFromDisk(String fileName){
        System.out.println("Carregando " + fileName);
    }
}
