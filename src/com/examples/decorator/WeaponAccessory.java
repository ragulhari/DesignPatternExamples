package com.examples.decorator;

import com.examples.decorator.interfaces.IWeapon;

/**
 * WeaponAccessory é uma classe que serve como base para todos os extensores disponíveis.
 * Todos os extensores devem estender essa classe, pois a mesma implementa operações básicas
 * comuns a todos objetos.
 */
public abstract class WeaponAccessory implements IWeapon {
    protected IWeapon decoratedWeapon;
    public String weaponDescription = "";

    /*Na inicialização do objeto devemos receber o objeto que será incrementado com o decorator
      e buscamos também a descrição atual do objeto (apenas para usar no exemplo e demonstrar o acumulo
      dos decorators.
     */
    public WeaponAccessory (IWeapon weapon){
        this.decoratedWeapon = weapon;
        weaponDescription = weapon.getWeaponDescription();
    }

    //Metodo que apenas retorna o status da descrição (usado no construtor dos decorators)
    public String getWeaponDescription() {
        return weaponDescription;
    }

    /*Método que realiza a operação para adicionar o comportamento do decorator ao objeto base.
        Para essa classe apenas executamos o método load da arma em questão.
    */
    public void load(){
        decoratedWeapon.load();
    }

    /*Método que serve para exibir o status do objeto e os decorators associados.
    */
    public void shot() {
        System.out.println("Atirando com " + weaponDescription);
    }
}
