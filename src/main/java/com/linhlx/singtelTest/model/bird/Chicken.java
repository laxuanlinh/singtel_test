package com.linhlx.singtelTest.model.bird;

import com.linhlx.singtelTest.model.Animal;
import com.linhlx.singtelTest.model.Soundable;

public class Chicken extends Animal implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("Cluck cluck");
    }
}
