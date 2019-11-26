package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
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
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class DayTest {

    Farm farm;
    Field field;
    Edible[] food = {new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new Tomato(), new Tomato(), new EarOfCorn()};
    ;

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
        farm = Sunday.plantField(farm);
        for (int i = 0; i < 5; i++) {
            Integer actual = farm.getField().get().get(i).get().size();
            Integer expected = 500;
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void testFeedFarmer() {
        farm = Day.feedFarmer(farm, food);
        Integer actual = farm.getFarmHouse().getFarmer().getStomachContents().size();
        Integer expected = 8;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRideHorses() {
        farm = Day.rideHorses(farm);
        ArrayList<Stable> stables = farm.getStables();
        for (Stable stable : stables) {
            for (Horse horse : stable.get()) {
                Assert.assertTrue(horse.hasBeenRidden);
            }
        }
    }

    @Test
    public void testFeedHorses() {
        farm = Day.feedHorses(farm);
        ArrayList<Stable> stables = farm.getStables();
        for (Stable stable : stables) {
            for (Horse horse : stable.get()) {
                Integer actual = horse.getStomachContents().size();
                Integer expected = 3;
                Assert.assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void testHarvest1() {
        farm = Day.plantField(farm);
        farm = Day.fertilize(farm);
        farm = Day.harvest(farm);
        Field field = farm.getField();
        for (CropRow cropRow : field.get()) {
            for (Crop crop : cropRow.get()) {
                Assert.assertTrue(crop.getHasBeenHarvested());
            }
        }
    }

    @Test
    public void testHarvest2() {
        field = farm.getField();
        String prev = farm.getSilo().toString();
        farm = Day.plantField(farm);
        farm = Day.fertilize(farm);
        farm = Day.harvest(farm);
        String after = farm.getSilo().toString();
        //System.out.println(prev);
        Assert.assertNotEquals(prev, after);
        //System.out.println(after);
        String expected = "Silo Inventory\n" +
                "\tEarOfCorn x 1520\n" +
                "\tTomato x 1020\n" +
                "\tEdibleEgg x 20";
        Assert.assertEquals(expected, after);
    }

    @Test
    public void testFertilize() {
        farm = Monday.fertilize(farm);
        Field field = farm.getField();
        for (CropRow cropRow : field.get()) {
            for (Crop crop : cropRow.get()) {
                Assert.assertTrue(crop.getHasBeenFertilized());
            }
        }
    }
}
