package com.base.DesignPatterns.Decorator.DressExample;

public class SportyDress extends DecoreatorDress{

    public SportyDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Sporty Dress...");
    }
}
