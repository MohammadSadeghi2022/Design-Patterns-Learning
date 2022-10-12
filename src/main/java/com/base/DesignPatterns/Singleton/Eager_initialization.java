package com.base.DesignPatterns.Singleton;

public class Eager_initialization {

 private static final Eager_initialization eager_initialization=new Eager_initialization();


 public static Eager_initialization getInstance(){

     return eager_initialization;
 }

}
