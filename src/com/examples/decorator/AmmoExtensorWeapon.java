package com.examples.decorator;

import com.examples.decorator.interfaces.IWeapon;

/**
 * A classe AmmoExtensor implementa um extensor de munição para armas. Como é um acessório
 * ela estende a classe WeaponAccessory, que já resolve algumas questões comuns a todos os acessórios
 * */
public class AmmoExtensorWeapon extends WeaponAccessory {
    public AmmoExtensorWeapon(IWeapon weapon) {
        super(weapon);
    }

    /*Método que realiza a operação para adicionar o comportamento do decorator ao objeto base.
        Para essa classe executa a operação de adicionar o extensor de munição.
    */
    @Override
    public void load() {
        setAmmoExtensor(decoratedWeapon);
    }

    /*Método que serve para exibir o status do objeto e os decorators associados.
    */
    @Override
    public void shot() {
        super.shot();
    }

    //Metodo que apenas retorna o status da descrição (usado no construtor dos decorators)
    @Override
    public String getWeaponDescription() {
        return super.getWeaponDescription();
    }

    /*Método que adiciona o comportamento de ammo extensor. Para fins do exemplo estamos apenas
        exibindo uma mensagem e adicionando em weaponDescription a propriedade adicionada.
    */
    private void setAmmoExtensor(IWeapon weapon) {
        System.out.println("Adicionando o extensor de munição");
        if (weaponDescription != null)
            weaponDescription += ", ";

        weaponDescription += "adicionado extensor de munição";
    }

}
