package com.linhlx.singtelTest.model;

import com.linhlx.singtelTest.model.parrot.LiveNearType;
import com.linhlx.singtelTest.model.parrot.Parrot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParrotTest {

    private Parrot parrot;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void shouldCreateParrotLiveNearDog(){
        givenParrotLiveNear(LiveNearType.DOG);
        assertNotNull(parrot);
    }
    
    @Test
    public void parrotLiveNearDogShouldSoundWoof(){
        givenParrotLiveNear(LiveNearType.DOG);
        parrot.makeSound();
        assertEquals("I live near DOG so I say Woof, woof", outContent.toString().trim());
    }

    private void givenParrotLiveNear(LiveNearType liveNearType) {
        parrot = new Parrot(liveNearType);
    }

}
