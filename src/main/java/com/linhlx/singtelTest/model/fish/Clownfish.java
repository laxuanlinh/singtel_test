package com.linhlx.singtelTest.model.fish;

public class Clownfish extends Fish {

    public Clownfish() {
        super(FishSize.SMALL, FishColor.ORANGE);
    }

    public void makeJoke(){
        System.out.println("So 2 dragons walk into a bar, the first one says 'Its hot in here'");
        System.out.println("The other one says 'You shut your mouth'");
    }
}
