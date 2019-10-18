package com.linhlx.singtelTest.model.bird.parrot;

public enum LiveNearType {

    DOG("Woof, woof"),
    CAT("Meow"),
    ROOSTER("Cock-a-doodle-doo"),
    DUCK("Quack quack")
    ;

    private String sound;

    LiveNearType(String sound) {
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }
}
