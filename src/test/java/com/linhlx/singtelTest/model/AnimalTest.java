package com.linhlx.singtelTest.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AnimalTest {

    private Animal animal;

    @Test
    public void shouldCreateAnimal(){
        animal = new Animal();
        assertNotNull(animal);
    }

}
