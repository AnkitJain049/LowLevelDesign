package com.lld.projects.calculator;

public class Number implements ArithmeticExpression {
    int num;
    public Number(int num){
        this.num=num;
    }
    public int evaluate() {
        System.out.println("Number value is: " + num);
        return num;
    }
}
