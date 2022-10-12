package com.base.DesignPatterns.ChainOfResponsibility.firstExample;

public interface Chain {
    /*
    یک الگوی رفتاری است که توانایی فراخوانی اشیاء به صورت زنجیره ای رو فراهم میکند
    */
    void setNextChain(Chain nextChain);

    void calculate(Numbers request);

}
