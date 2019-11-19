package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Person;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {
    @Test
    public void testAddPerson1() {
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Farmer();

        farmHouse.add(person);
        Assert.assertEquals(person, farmHouse.get().get(0));
    }

    @Test
    public void testAddPerson2() {
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Farmer();
        farmHouse.add(person);
        farmHouse.add(person);

        Assert.assertEquals(2, farmHouse.get().size());
    }

    @Test
    public void testRemovePerson() {
        FarmHouse farmhouse = new FarmHouse();
        Person person = new Farmer();
        farmhouse.add(person);
        farmhouse.remove(person);
        Assert.assertTrue(farmhouse.get().isEmpty());
    }

    @Test
    public void testRemoveAll() {
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(new Farmer());
        farmHouse.add(new Pilot());
        farmHouse.removeAll();
        Assert.assertTrue(farmHouse.get().isEmpty());
    }
}
