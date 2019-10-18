package com.linhlx.singtelTest.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RoosterTest {
    private Rooster rooster;

    @Before
    public void setUp(){
        rooster = new Rooster();
    }

    @Test
    public void shouldCreateRooster(){
        assertNotNull(rooster);
    }

    @Test
    public void roosterShouldMakeSound(){
        rooster.makeSound();
    }
}
