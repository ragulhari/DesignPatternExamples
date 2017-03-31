package com.examples.builder;

/**
 * Classe que define um objeto pizza, e cada componente dele (massa/molho/recheio).
 * Há também um método "detalharPizza" que retorna os componentes que compõem cada pizza.
 */
public class Pizza {
    private String massa = "";
    private String molho = "";
    private String recheio = "";

    public void defineMassa(String massa)     { this.massa = massa; }
    public void defineMolho(String molho)     { this.molho = molho; }
    public void defineRecheio(String recheio) { this.recheio = recheio; }

    public String detalharPizza() {
        return massa + ", " + molho + ", " + recheio;
    }
}
