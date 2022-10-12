package com.base.DesignPatterns.Decorator.DressExample;

public class FancyDress extends DecoreatorDress{
    public FancyDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Fancy Dress..");
    }
}
