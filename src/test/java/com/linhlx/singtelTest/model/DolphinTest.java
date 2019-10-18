package com.linhlx.singtelTest.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DolphinTest {
    private Dolphin dolphin;

    @Before
    public void setUp(){
        dolphin = new Dolphin();
    }

    @Test
    public void shouldCreateDolphin(){
        assertNotNull(dolphin);
    }

    @Test
    public void dolphinShouldSwim(){
        dolphin.swim();
    }

}
