package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {
    @Test
    public void testAddChicken1() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();

        coop.add(chicken);
        Assert.assertEquals(chicken, coop.get().get(0));
    }

    @Test
    public void testAddChicken2() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        coop.add(chicken);
        coop.add(chicken);

        Assert.assertEquals(2, coop.get().size());
    }

    @Test
    public void testRemoveChicken() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        coop.add(chicken);
        coop.remove(chicken);
        Assert.assertTrue(coop.get().isEmpty());
    }

    @Test
    public void testRemoveAll() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        coop.add(chicken);
        coop.add(chicken);
        coop.removeAll();
        Assert.assertTrue(coop.get().isEmpty());
    }
}
