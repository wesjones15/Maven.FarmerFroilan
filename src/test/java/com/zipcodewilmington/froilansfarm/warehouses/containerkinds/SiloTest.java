package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SiloTest {
    @Test
    public void testAdd1() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        silo.add(corn);
        Assert.assertEquals((Integer) 1, silo.getAmountOf(corn));
    }

    @Test
    public void testAdd2() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        silo.add(corn);
        silo.add(corn);

        Assert.assertEquals((Integer) 2, silo.size());
    }

    @Test
    public void testRemove() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        silo.add(corn);
        silo.remove(corn);
        Assert.assertTrue(silo.size() == 0);
    }

    @Test
    public void testRemoveAll() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        silo.add(corn);
        silo.add(corn);
        silo.removeAll();
        Integer expected = 0;
        Integer actual = silo.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddAll() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        Tomato tomato = new Tomato();
        ArrayList<Edible> harvest = new ArrayList<Edible>(Arrays.asList(corn, corn, tomato, tomato, corn, corn));
        silo.addAll(harvest);
        Assert.assertEquals((Integer) 6, silo.size());
    }

    @Test
    public void testGetAmountOf1() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        Tomato tomato = new Tomato();
        ArrayList<Edible> harvest = new ArrayList<Edible>(Arrays.asList(corn, corn, tomato, tomato, corn, corn));
        silo.addAll(harvest);
        Integer actual = silo.getAmountOf(corn);
        Integer expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAmountOf2() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        Tomato tomato = new Tomato();
        ArrayList<Edible> harvest = new ArrayList<Edible>(Arrays.asList(corn, corn, tomato, tomato, corn, corn));
        silo.addAll(harvest);
        Integer actual = silo.getAmountOf(new Tomato());
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFood1() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        Tomato tomato = new Tomato();
        ArrayList<Edible> harvest = new ArrayList<Edible>(Arrays.asList(corn, corn, tomato, tomato, corn, corn));
        silo.addAll(harvest);
        Edible actual = silo.getFood(corn);
        Assert.assertEquals(corn.getClass().getSimpleName(), actual.getClass().getSimpleName());

        Assert.assertEquals((Integer) 5, silo.size());
    }

    @Test
    public void testGetFood2() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        Tomato tomato = new Tomato();
        ArrayList<Edible> harvest = new ArrayList<Edible>(Arrays.asList(corn, corn, corn, corn, corn, corn));
        silo.addAll(harvest);
        Edible actual = silo.getFood(tomato);

        Assert.assertNull(actual);
        Assert.assertEquals((Integer) 6, silo.size());
    }

    @Test
    public void testToString1() {
        Silo silo = new Silo();
        EarOfCorn corn = new EarOfCorn();
        Tomato tomato = new Tomato();
        EdibleEgg egg = new EdibleEgg();
        ArrayList<Edible> harvest = new ArrayList<Edible>(Arrays.asList(corn, corn, tomato, tomato, corn, corn, egg, egg, egg, corn, tomato));
        silo.addAll(harvest);
        String actual = silo.toString();
        String expected = "Silo Inventory\n" +
                "\tEarOfCorn x 5\n" +
                "\tTomato x 3\n" +
                "\tEdibleEgg x 3";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString2() {
        Silo silo = new Silo();
        String actual = silo.toString();
        String expected = "Silo Inventory\n" +
                "\tEarOfCorn x 0\n" +
                "\tTomato x 0\n" +
                "\tEdibleEgg x 0";
        Assert.assertEquals(expected, actual);
    }
}
