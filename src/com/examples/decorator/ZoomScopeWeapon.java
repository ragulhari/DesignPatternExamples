package com.examples.decorator;

import com.examples.decorator.interfaces.Weapon;

public class ZoomScopeWeapon extends WeaponAccessory {

    public ZoomScopeWeapon(Weapon decoratedWeapon) {
        super(decoratedWeapon);
    }

    @Override
    public void load() {
        decoratedWeapon.load();
        setZoomScope(decoratedWeapon);

    }

    private void setZoomScope(Weapon decoratedWeapon){
      System.out.println("Adicionando o zoom scope 4x");
    }
}
