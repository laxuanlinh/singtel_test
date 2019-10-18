package com.linhlx.singtelTest.model.fish;

public class Shark extends Fish {

    public Shark() {
        super(FishSize.BIG, FishColor.GREY);
    }

    public void hunt(){
        System.out.println("I'm eating");
    }
}
