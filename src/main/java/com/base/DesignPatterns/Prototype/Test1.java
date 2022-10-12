package com.base.DesignPatterns.Prototype;

public class Test1 {
    public static void main(String[] args) {
        //Statement.StatementBuilder builder=new Statement.StatementBuilder();
        Statement statement = Statement.getBuilder().setFrom("from Employeee").
                setProjection("select firstName, lastName").
                setWhere("where id=12").createStatement();
        statement.setRecord(new Record());

        System.out.println(statement.hashCode());
        System.out.println(statement.getRecord().hashCode());


        Statement clone = statement.clone();
        System.out.println(clone.hashCode());
        System.out.println(clone.getRecord().hashCode());

    }
}
