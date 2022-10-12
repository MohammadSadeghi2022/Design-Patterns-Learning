package com.base.DesignPatterns.Decorator.CarExample;

public class Person {
    public static void main(String[] args) {

//        Car luxeryCar = new LuxeryCar(new PassengerCar(new BasicCar()));
//        luxeryCar.design();

        Car passengerCar=new PassengerCar(new LuxeryCar(new BasicCar()));
        passengerCar.design();
    }
}
