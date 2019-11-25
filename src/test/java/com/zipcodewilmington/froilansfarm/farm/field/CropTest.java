package com.zipcodewilmington.froilansfarm.farm.field;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropTest {
    Crop crop;

    @Before
    public void setUp(){
        crop = new CornStalk();
        crop = new TomatoPlant();
    }

    @Test
    public void testSetHasBeenFertilized() {
        crop.setHasBeenFertilized(true);
        Assert.assertTrue(crop.getHasBeenFertilized());
    }

    @Test
    public void testSetHasBeenHarvested() {
        crop.setHasBeenHarvested(true);
        Assert.assertTrue(crop.getHasBeenHarvested());
    }
}
