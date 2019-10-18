package com.linhlx.singtelTest.model.bird;

import com.linhlx.singtelTest.model.Animal;
import com.linhlx.singtelTest.model.Singable;
import com.linhlx.singtelTest.model.Walkable;

public class Bird extends Animal implements Singable, Walkable {

    @Override
    public void sing() {
        System.out.println("I'm singing");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking");
    }
}
