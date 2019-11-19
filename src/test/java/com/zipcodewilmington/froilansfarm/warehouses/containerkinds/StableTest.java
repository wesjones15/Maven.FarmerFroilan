package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {
    @Test
    public void testAddHorse1() {
        Stable stable = new Stable();
        Horse horse = new Horse();

        stable.add(horse);
        Assert.assertEquals(horse, stable.get().get(0));
    }

    @Test
    public void testAddHorse2() {
        Stable stable = new Stable();
        Horse horse = new Horse();
        stable.add(horse);
        stable.add(horse);

        Assert.assertEquals(2, stable.get().size());
    }

    @Test
    public void testRemoveHorse() {
        Stable stable = new Stable();
        Horse horse = new Horse();
        stable.add(horse);
        stable.remove(horse);
        Assert.assertTrue(stable.get().isEmpty());
    }

    @Test
    public void testRemoveAll() {
        Stable stable = new Stable();
        Horse horse = new Horse();
        stable.add(horse);
        stable.add(horse);
        stable.removeAll();
        Assert.assertTrue(stable.get().isEmpty());
    }
}
