package com.base.DesignPatterns.ChainOfResponsibility.firstExample;

public class ClassMulNumber implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted().equals("mul")) {

            System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " +
                    request.getNumber1() * request.getNumber2());
        } else {
            System.out.println(" plase enter valid operation: add,div,sub,mul");
        }
    }
}
