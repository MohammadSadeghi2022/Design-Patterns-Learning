package com.base.DesignPatterns.Decorator.CarExample;

public class LuxeryCar extends Decorator{
    public LuxeryCar(Car car) {
        super(car);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Luxery Car design");
    }
}
