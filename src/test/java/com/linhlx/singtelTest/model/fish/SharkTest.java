package com.linhlx.singtelTest.model.fish;

import org.junit.Before;
import org.junit.Test;

import static com.linhlx.singtelTest.model.fish.FishColor.GREY;
import static com.linhlx.singtelTest.model.fish.FishSize.BIG;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SharkTest {

    private Shark shark;

    @Before
    public void setUp(){
        shark = new Shark();
    }

    @Test
    public void sharkShouldBeCreated(){
        assertNotNull(shark);
        assertEquals(BIG, shark.getSize());
        assertEquals(GREY, shark.getColor());
    }

    @Test
    public void sharkShouldEat(){
        shark.hunt();
    }

}
