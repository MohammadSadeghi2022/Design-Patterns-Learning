package com.base.DesignPatterns.Decorator.Weapon.Accessory;

import com.base.DesignPatterns.Decorator.Weapon.Decoraor.DecoratorGun;
import com.base.DesignPatterns.Decorator.Weapon.Gun;

public class Camera extends DecoratorGun {


    public Camera(Gun gun) {
        super(gun);
    }

    @Override
    public void aim_and_fire() {
        super.aim_and_fire();
        System.out.println(" added camera successfuly");
    }
}
