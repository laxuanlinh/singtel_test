package com.linhlx.singtelTest.model.fish;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FishTest {

    private Fish fish;

    @Before
    public void setUp(){
        fish = new Fish(FishSize.MEDIUM, FishColor.GENERIC);
    }

    @Test
    public void shouldCreateFish(){
        assertNotNull(fish);
        assertEquals(FishSize.MEDIUM, fish.getSize());
        assertEquals(FishColor.GENERIC, fish.getColor());
    }

    @Test
    public void fishShouldSwim(){
        fish.swim();
    }

}
