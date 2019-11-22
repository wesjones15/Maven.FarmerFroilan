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
        //TODO fix
        // it appears that when the first Crop in each row is harvested
        // that it is setting hasBeenHarvested to true for every crop in that row
        // and as a result, is only putting the first item from each row into the silo
        // might be due to when i plant fields on sunday i am using the same new crop instance to all of the row
        String prev = farm.getSilo().toString();
        farm = Sunday.run(farm);
        farm = Monday.run(farm);
        farm = Tuesday.run(farm);
        String after = farm.getSilo().toString();
        Assert.assertEquals(prev, after);
    }
}
