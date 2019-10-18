package com.linhlx.singtelTest.model.fish;

import com.linhlx.singtelTest.model.Animal;
import com.linhlx.singtelTest.model.Swimable;

public class Fish extends Animal implements Swimable {
    @Override
    public void swim() {
        System.out.println("I can swim and dive");
    }
}
