package com.base.DesignPatterns.Facade;

public class CalculationTax implements Calculation {
    @Override
    public int calculate() {
        return 10;
    }
}
