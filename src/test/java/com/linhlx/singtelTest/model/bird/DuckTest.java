package com.linhlx.singtelTest.model.bird;

import com.linhlx.singtelTest.model.bird.Duck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DuckTest {

    private Duck duck;

    @Before
    public void setUp(){
        duck = new Duck();
    }

    @Test
    public void shouldCreateDuck(){
        assertNotNull(duck);
    } 
    
    @Test
    public void duckShouldMakeSound(){
        duck.makeSound();
    }
    
    @Test
    public void duckShouldSwim(){
        duck.swim();
    }

}
