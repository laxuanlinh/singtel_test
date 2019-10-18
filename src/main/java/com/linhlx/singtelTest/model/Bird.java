package com.linhlx.singtelTest.model;

public class Bird extends Animal implements Singable {

    public void fly(){
        System.out.println("I'm flying");
    }

    @Override
    public void sing() {
        System.out.println("I'm singing");
    }
}
