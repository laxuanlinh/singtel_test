package com.linhlx.singtelTest.model.fish;

import org.junit.Before;
import org.junit.Test;

import static com.linhlx.singtelTest.model.fish.FishColor.ORANGE;
import static com.linhlx.singtelTest.model.fish.FishSize.SMALL;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClownfishTest {

    private Clownfish clownfish;

    @Before
    public void setUp(){
        clownfish = new Clownfish();
    }

    @Test
    public void shouldCreateClownfish(){
        assertNotNull(clownfish);
        assertEquals(SMALL, clownfish.getSize());
        assertEquals(ORANGE, clownfish.getColor());
    }

    @Test
    public void clownfishShouldMakeJoke(){
        clownfish.makeJoke();
    }

}
