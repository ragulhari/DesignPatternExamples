package com.examples.decorator;

import com.examples.decorator.interfaces.IWeapon;

/**
 * Classe inicial do exemplo.
 *
 * Neste exemplo do pattern Decorator consiste em demonstrar a aplicação de propriedades acessórias
 * e temporárias a um objeto. Neste exemplo simulamos uma arma que pode receber diversos extensores
 * como, por exemplo, um extensor para aumentar o zoom da mira. Cada possivel extensão é implementada
 * como uma classe.
 *
 * Apresentamos a classe com o objeto sem extensão (BaseWeapon) e todos os acessórios possíveis estendem
 * a classe WeaponAccessory, que implementa informações básicas necessários de todos os acessórios.
 * Tanto a classe BaseWeapon como WeaponAccessory implementam a interface IWeapon.
 *
 * Uma vez criado o objeto BaseWeapon, podemos adicionar ou alterar comportamentos encapsulando o objeto
 * em um objeto acessório (no nosso exemplo o objeto ZoomScopeWeapon). Podem ser encapsulados quantos
 * objetos se desejar.
 *
 * Por fim, executamos o método shot(), para demonstrar todas as propriedades adicionadas à arma básica,
 * para demonstrar a mudança de comportamento por conta do Decorator
 *
 * @author Ricardo D. Agulhari
 * Janeiro/2017
 */
public class ExecutaDecorator {
    public static void go() {

        //Iniciamos o exemplo criando e atirando (método shot) com uma arma básica
        IWeapon weapon = new BaseWeapon();
        weapon.load();
        weapon.shot();

        //Adicionando o primeiro extensor (decorator) em nossa arma
        IWeapon zoomScopeWeapon = new ZoomScopeWeapon(weapon);
        zoomScopeWeapon.load();

        /*Adicionando o segundo extensor (decorator) e executando o método shot()
         para demonstrar o uso dos dois decorators */
        IWeapon ammoExtensorWeapon = new AmmoExtensorWeapon(zoomScopeWeapon);
        ammoExtensorWeapon.load();
        ammoExtensorWeapon.shot();
    }
}
