package com.examples.proxy;

import com.examples.proxy.interfaces.IImagem;

/**
 * A classe ImagemReal simula uma manipulação de fato de uma imagem, fazendo a leitura do mesmo no disco, por
 * exemplo, através do método "loadFromDisk". Também há métodos referentes à obtenção de dados
 * de altura e largura da imagem.
 */
class ImagemReal implements IImagem {

    private String nomeArquivo;
    private int width = 640;
    private int height = 480;

    public ImagemReal(String arquivo, int width, int height){
        this.nomeArquivo = arquivo;
        this.width = width;
        this.height = height;
        loadFromDisk(arquivo);
    }

    public ImagemReal(String arquivo){
        this.nomeArquivo = arquivo;
        loadFromDisk(arquivo);
    }

    /*Para fins de exemplo, estamos apenas retornando um valor fixo. Em situação real, entende-se que essa classe
    realizaria uma operação de obter do arquivo da imagem o tamanho solicitado (comprimento), o que pode se tornar
    um alto custo em caso de uso massivo. Por isso o uso do proxy seria para armazenar em uma classe leve (uma vez
    que o objeto não seria carregado em memória esse dado como um metadado da imagem*/
    protected int getWidth() {
        return width;
    }

    /*Para fins de exemplo, estamos apenas retornando um valor fixo. Em situação real, entende-se que essa classe
    realizaria uma operação de obter do arquivo da imagem o tamanho solicitado (altura), o que pode se tornar
    um alto custo em caso de uso massivo. Por isso o uso do proxy seria para armazenar em uma classe leve (uma vez
    que o objeto não seria carregado em memória esse dado como um metadado da imagem*/
    protected int getHeight() {
        return height;
    }
    @Override
    public void display() {
        System.out.println("Exibindo o arquivo " + nomeArquivo);
    }

    @Override
    public String getResolution() {
        /*Nessa implementação, seria necessário conferir o tamanho diretamente na imagem, o que se torna uma
        operação cara. Para fins de exemplo, estamos retornando um valor fixo definido na classe.
        */
        return Integer.toString(width) + "x" + Integer.toString(height);
    }


    private void loadFromDisk(String fileName){
        System.out.println("Carregando " + fileName);
    }
}
