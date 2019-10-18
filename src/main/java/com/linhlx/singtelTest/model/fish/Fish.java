package com.linhlx.singtelTest.model.fish;

import com.linhlx.singtelTest.model.Animal;
import com.linhlx.singtelTest.model.Swimable;

public class Fish extends Animal implements Swimable {

    private final FishSize size;
    private final FishColor color;

    public Fish(FishSize size, FishColor color) {
        this.size = size;
        this.color = color;
    }

    public FishSize getSize() {
        return size;
    }

    public FishColor getColor() {
        return color;
    }

    @Override
    public void swim() {
        System.out.println("I can swim and dive");
    }
}
