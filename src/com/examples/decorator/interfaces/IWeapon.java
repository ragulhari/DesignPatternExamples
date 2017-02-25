package com.examples.decorator.interfaces;

/**
 * Interface IWeapon, que implementa três métodos:
 *  load() -> para configurar a arma criada ou extensor adicionado
 *  shot() -> para "atirar", ou seja, demonstrar o status atual do objeto, com todos os decorator presentes
 *  getWeaponDescription() -> Para retornar uma String que funciona como um "status" do objeto, para fim do exemplo
 */
public interface IWeapon {
    void load();
    void shot();
    String getWeaponDescription();
}
