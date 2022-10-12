package com.base.DesignPatterns.Decorator.CarExample;

public class Decorator implements Car{
    private Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    @Override
    public void design() {
        this.car.design();
    }
}
