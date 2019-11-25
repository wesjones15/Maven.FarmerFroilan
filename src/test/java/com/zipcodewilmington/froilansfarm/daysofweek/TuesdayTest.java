package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TuesdayTest {
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
    public void testHarvest1() {
        farm = Tuesday.run(farm);
        Field field = farm.getField();
        for (CropRow cropRow : field.get()) {
            for (Crop crop : cropRow.get()) {
                Assert.assertTrue(crop.getHasBeenHarvested());
            }
        }
    }

    @Test
    public void testHarvest2() {
        String prev = farm.getSilo().toString();
        farm = Sunday.run(farm);
        farm = Monday.run(farm);
        farm = Tuesday.run(farm);
        String after = farm.getSilo().toString();
        Assert.assertNotEquals(prev, after);
        String expected = "Silo Inventory\n" +
                "\tEarOfCorn x 1520\n" +
                "\tTomato x 1020\n" +
                "\tEdibleEgg x 20";
        Assert.assertEquals(expected, after);
    }
}
