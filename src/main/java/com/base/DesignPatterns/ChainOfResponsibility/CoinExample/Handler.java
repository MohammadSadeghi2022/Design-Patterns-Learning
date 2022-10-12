package com.base.DesignPatterns.ChainOfResponsibility.CoinExample;

public abstract class Handler {
    protected Handler Successor;

    public void setSuccessor(Handler successor) {
        Successor = successor;
    }

    protected abstract void answerRequest(int coin);
}
