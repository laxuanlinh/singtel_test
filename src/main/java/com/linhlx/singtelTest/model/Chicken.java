package com.linhlx.singtelTest.model;

public class Chicken extends Animal implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("Cluck cluck");
    }
}
