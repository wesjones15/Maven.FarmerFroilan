package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Person;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmHouseTest {
    Person person;
    FarmHouse farmHouse;

    @Before
    public void setUp() throws Exception {
        farmHouse = new FarmHouse();
        person = new Farmer("BIG Froilan");
    }

    @Test
    public void testAddPerson1() {
        farmHouse.add(person);
        Assert.assertEquals(person, farmHouse.get().get(0));
    }

    @Test
    public void testAddPerson2() {
        farmHouse.add(person);
        farmHouse.add(person);
        Assert.assertEquals(2, farmHouse.get().size());
    }

    @Test
    public void testRemovePerson() {
        farmHouse.add(person);
        farmHouse.remove(person);
        Assert.assertTrue(farmHouse.get().isEmpty());
    }

    @Test
    public void testRemoveAll() {
        farmHouse.add(new Farmer("John"));
        farmHouse.add(new Pilot("Froilanda"));
        farmHouse.removeAll();
        Assert.assertTrue(farmHouse.get().isEmpty());
    }
}
