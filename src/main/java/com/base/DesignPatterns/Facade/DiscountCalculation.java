package com.base.DesignPatterns.Facade;

public class DiscountCalculation implements Calculation {
    @Override
    public int calculate() {
        return 20;
    }
}
