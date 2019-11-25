package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;

import java.util.ArrayList;

public class WednesdayTest {

    Farm farm;
    Pilot pilot;
    Farmer farmer;
    Edible EdibleEgg, Tomato, EarOfCorn;
    Edible [] myFood = {new EdibleEgg(), new Tomato(), new EarOfCorn()};

    @Before
    public void setUp() {
        Simulation sim = new Simulation();
        farm = new Farm();
        farm.setSilo(sim.preFillSilo());
        farm.getFarmHouse().add(new Farmer("Froilan"));
        farm.getFarmHouse().add(new Pilot("Froilanda"));

    }

    @Test
    public void testfeedFarmer () {
        Edible [] expected = new Edible[3];
        expected[0] = new EdibleEgg();
        expected[1] = new Tomato();
        expected[2] = new EarOfCorn();
        Day.feedFarmer(farm, myFood);
        farmer = farm.getFarmHouse().getFarmer();
        ArrayList<Edible> stomach = farmer.getStomachContents();
        Edible[] actual = new Edible[stomach.size()];
        actual= stomach.toArray(actual);
        for (int i = 0; i < stomach.size(); i++){
            Assert.assertEquals(actual[i].getClass().getSimpleName(), (expected[i].getClass().getSimpleName()));
        }
    }

    @Test
    public void testFeedPilot () {
        Edible [] expected = new Edible[4];
        expected[0] = new EdibleEgg();
        expected[1] = new Tomato();
        expected[2] = new EarOfCorn();
        expected[3] = new EdibleEgg();
        Day.feedPilot(farm, myFood);
        pilot = farm.getFarmHouse().getPilot();
        ArrayList<Edible> stomach = pilot.getStomachContents();
        Edible[] actual = new Edible[stomach.size()];
        actual= stomach.toArray(actual);
        for (int i = 0; i < stomach.size(); i++){
            Assert.assertEquals(actual[i].getClass().getSimpleName(), (expected[i].getClass().getSimpleName()));
        }
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
