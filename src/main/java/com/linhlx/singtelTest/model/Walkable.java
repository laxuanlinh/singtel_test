package com.linhlx.singtelTest.model;

public interface Walkable {

    default void walk() {
        System.out.println("I'm walking");
    }

}
