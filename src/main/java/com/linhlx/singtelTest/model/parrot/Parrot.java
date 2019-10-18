package com.linhlx.singtelTest.model.parrot;

import com.linhlx.singtelTest.model.Animal;
import com.linhlx.singtelTest.model.Soundable;

public class Parrot extends Animal implements Soundable {

    final LiveNearType liveNear;

    public Parrot(LiveNearType liveNear) {
        this.liveNear = liveNear;
    }

    @Override
    public void makeSound() {
        System.out.println("I live near "+liveNear+" so I say "+liveNear.getSound());
    }
}
