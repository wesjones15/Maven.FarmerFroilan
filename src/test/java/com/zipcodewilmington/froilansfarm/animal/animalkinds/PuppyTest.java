package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import org.junit.Assert;
import org.junit.Test;

public class PuppyTest {
    @Test
    public void testMakeNoise() {
        Animal puppy = new Puppy();
        String expected = "Bork";
        String actual = puppy.makeNoise();
        Assert.assertEquals(expected, actual);
    }
}

