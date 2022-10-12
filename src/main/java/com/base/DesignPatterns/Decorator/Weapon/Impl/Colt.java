package com.base.DesignPatterns.Decorator.Weapon.Impl;

import com.base.DesignPatterns.Decorator.Weapon.Gun;

public class Colt implements Gun {
    @Override
    public void aim_and_fire() {
        System.out.println("basic colt");
    }
}
