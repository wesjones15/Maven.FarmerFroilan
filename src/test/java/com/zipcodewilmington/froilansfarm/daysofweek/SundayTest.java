package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SundayTest {
    Farm farm;

    @Before
    public void setUp() {
        Simulation sim = new Simulation();
        farm = new Farm();
        farm.setSilo(sim.preFillSilo());
        farm.getFarmHouse().add(new Farmer("Froilan"));
        farm.getFarmHouse().add(new Pilot("Froilanda"));
    }

    @Test
    public void testPlantField() {
//        Farm farm = new Farm();
//        farm.getFarmHouse().add(new Farmer("Froilan"));
        farm = Sunday.plantField(farm);
        for (int i = 0; i < 5; i++) {
            Integer actual = farm.getField().get().get(i).get().size();
            Integer expected = 500;
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void testRun() {
        farm = Sunday.run(farm);
        Integer actual = farm.getFarmHouse().getFarmer().getStomachContents().size();
        Integer expected = 8;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRideHorses() {
        farm = Sunday.run(farm);
        ArrayList<Stable> stables = farm.getStables();
        for (Stable stable : stables) {
            for (Horse horse : stable.get()) {
                Assert.assertTrue(horse.hasBeenRidden);
            }
        }
    }

    @Test
    public void testFeedHorses() {
        farm = Sunday.run(farm);
        ArrayList<Stable> stables = farm.getStables();
        for (Stable stable : stables) {
            for (Horse horse : stable.get()) {
                Integer actual = horse.getStomachContents().size();
                Integer expected = 3;
                Assert.assertEquals(expected, actual);
            }
        }
    }
}
