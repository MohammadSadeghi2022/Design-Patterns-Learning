package com.base.DesignPatterns.ChainOfResponsibility.firstExample;

public class ClassSubNumers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted().equals("sub")) {

            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = ");
            int i = request.getNumber1() - request.getNumber2();
            System.out.println(i);

        } else {
            nextInChain.calculate(request);
        }
    }
}

