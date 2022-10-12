package com.base.DesignPatterns.ChainOfResponsibility.CoinExample;

public class Step1 extends Handler {


    @Override
    protected void answerRequest(int coin) {
        if (coin > 0 && coin < 25) {
            System.out.println(new StringBuilder().append("step1 and coin is: ").append(coin));
        } else {
            Successor.answerRequest(coin);
        }
    }
}
