package com.base.DesignPatterns.Decorator.DressExample;

public class DecoreatorDress implements Dress {
    private Dress dress;

    public DecoreatorDress(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void assemble() {
        this.dress.assemble();
    }
}
