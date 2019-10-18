package com.linhlx.singtelTest.model;

public class Bird extends Animal implements Singable{

    @Override
    public void sing() {
        System.out.println("I'm singing");
    }
}
