package com.base.DesignPatterns.Facade;

import org.springframework.beans.factory.annotation.Autowired;

public class Facade {

    @Autowired
    private BasePremiumCalculation basePremiumCalculation;
    private CalculationTax calculationTax;
    private DiscountCalculation discountCalculation;

    public Facade() {
        this.basePremiumCalculation = basePremiumCalculation;
        this.calculationTax = new CalculationTax();
        this.discountCalculation = new DiscountCalculation();
    }

    public int finalCalculation() {
        return basePremiumCalculation.calculate()-discountCalculation.calculate()+ calculationTax.calculate();
    }

}
