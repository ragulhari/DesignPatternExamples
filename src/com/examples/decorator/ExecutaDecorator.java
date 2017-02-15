package com.examples.decorator;

/**
 * Created by ricardo on 2/14/17.
 */
public class ExecutaDecorator {
    public static void go() {
        Weapon weapon = new BaseWeapon();
        Weapon zoomScopeWeapon = new ZoomScopeWeapon(new BaseWeapon());
        System.out.println("\nArma básica: ");
        weapon.load();
        System.out.println("\nArma com scope zoom: ");
        zoomScopeWeapon.load();
    }
}
