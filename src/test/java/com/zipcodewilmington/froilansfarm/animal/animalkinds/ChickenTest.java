package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void testMakeNoise() {
        Animal chicken = new Chicken();
        String expected = "Bawk";
        String actual = chicken.makeNoise();
        Assert.assertEquals(expected, actual);
    }
}
