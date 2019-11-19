package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class SiloTest {
    @Test
    public void testAdd1() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        silo.add(corn);
        Assert.assertEquals(corn, silo.get().get(0));
    }

    @Test
    public void testAdd2() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        silo.add(corn);
        silo.add(corn);

        Assert.assertEquals(2, silo.get().size());
    }

    @Test
    public void testRemove() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        silo.add(corn);
        silo.remove(corn);
        Assert.assertTrue(silo.get().isEmpty());
    }

    @Test
    public void testRemoveAll() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        silo.add(corn);
        silo.add(corn);
        silo.removeAll();
        Assert.assertTrue(silo.get().isEmpty());
    }
}
