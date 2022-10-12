package com.base.DesignPatterns.ChainOfResponsibility.CoinExample;

public class Step2 extends Handler{
    @Override
    protected void answerRequest(int coin) {
        if (coin > 25 && coin < 50) {
            System.out.println(new StringBuilder().append("step2 and coin is: ").append(coin));
        } else {
            Successor.answerRequest(coin);
        }
    }
}
