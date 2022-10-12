package com.base.DesignPatterns.DI_designPattern;

import org.springframework.beans.factory.annotation.Autowired;

public class CarImp {

    @Autowired
    Car car;
    public CarImp(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

}
