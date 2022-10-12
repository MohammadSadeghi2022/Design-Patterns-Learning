package com.base.DesignPatterns.ChainOfResponsibility.firstExample;

public class ClassAddNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted().equals("add")) {

            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = " );
            System.out.println( request.getNumber1() + request.getNumber2());
        } else {
            nextInChain.calculate(request);
        }
    }
}
