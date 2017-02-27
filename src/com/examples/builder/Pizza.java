package com.examples.builder;

/**
 * Created by ricardo on 2/27/17.
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
