package com.examples.decorator;

import com.examples.decorator.interfaces.IWeapon;

/**
 * A classe ZoomScopeWeapon implementa o zoom para ser adicionado em armas. Como é um acessório
 * ela estende a classe WeaponAccessory, que já resolve algumas questões comuns a todos os acessórios
 * */
public class ZoomScopeWeapon extends WeaponAccessory {

    public ZoomScopeWeapon(IWeapon decoratedWeapon) {
        super(decoratedWeapon);
    }

    /*Método que realiza a operação para adicionar o comportamento do decorator ao objeto base.
        Para essa classe executa a operação de adicionar o zoom scope.
    */
    @Override
    public void load() {
        setZoomScope(decoratedWeapon);
    }

    /*Método que serve para exibir o status do objeto e os decorators associados.
    */
    @Override
    public void shot() {
        super.shot();
    }

    //Metodo que apenas retorna o status da descrição (usado no construtor dos decorators)
    public String getWeaponDescription() {
        return weaponDescription;
    }

    /*Método que adiciona o comportamento de zoom scope. Para fins do exemplo estamos apenas
        exibindo uma mensagem e adicionando em weaponDescription a propriedade adicionada.
    */
    private void setZoomScope(IWeapon decoratedWeapon){
        System.out.println("Adicionando o zoom scope 4x");
        if (weaponDescription != null)
            weaponDescription += ", ";

        weaponDescription += "adicionado zoom scope";
    }
}
