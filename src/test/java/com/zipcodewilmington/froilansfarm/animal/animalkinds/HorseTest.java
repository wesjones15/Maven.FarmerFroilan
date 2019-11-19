package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void testMakeNoise() {
        Animal horse = new Horse();
        String expected = "Neigh";
        String actual = horse.makeNoise();
        Assert.assertEquals(expected, actual);
    }
}
