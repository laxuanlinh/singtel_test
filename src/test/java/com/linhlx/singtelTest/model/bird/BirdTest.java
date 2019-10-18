package com.linhlx.singtelTest.model.bird;


import com.linhlx.singtelTest.model.bird.Bird;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    private Bird bird;

    @Before
    public void setUp(){
        bird = new Bird();
    }

    @Test
    public void shouldCreateBird(){
        assertNotNull(bird);
    }

    @Test
    public void birdShouldSing(){
        bird.sing();
    }

    @Test
    public void birdShouldWalk(){
        bird.walk();
    }

}
