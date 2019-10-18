package com.linhlx.singtelTest.model.bird;

import com.linhlx.singtelTest.model.bird.Chicken;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ChickenTest {

    private Chicken chicken;

    @Before
    public void setUp(){
        chicken = new Chicken();
    }

    @Test
    public void shouldCreateChicken(){
        assertNotNull(chicken);
    }

    @Test
    public void chickenShouldMakeSound(){
        chicken.makeSound();
    }

}
