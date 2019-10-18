package com.linhlx.singtelTest.model.bird;

import com.linhlx.singtelTest.model.Soundable;
import com.linhlx.singtelTest.model.Swimable;

public class Duck extends Bird implements Soundable, Swimable {

    @Override
    public void makeSound() {
        System.out.println("Quack quack");
    }

    @Override
    public void swim() {
        System.out.println("Just chilling in the lake");
    }
}
