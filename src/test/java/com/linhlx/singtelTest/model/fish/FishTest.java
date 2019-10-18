package com.linhlx.singtelTest.model.fish;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FishTest {

    private Fish fish;

    @Before
    public void setUp(){
        fish = new Fish();
    }

    @Test
    public void shouldCreateFish(){
        assertNotNull(fish);
    }

    @Test
    public void fishShouldSwim(){
        fish.swim();
    }

}
