package com.linhlx.singtelTest.model;

public interface Swimable {

    default void swim(){
        System.out.println("I'm swimming");
    };

}
