package com.zipcodewilmington.froilansfarm.farm.field;

import org.junit.Assert;
import org.junit.Test;

public class CropTest {
    @Test
    public void testGetHasBeenFertilized() {
        Crop crop = new CornStalk();
        crop.setHasBeenFertilized(true);
        Assert.assertTrue(crop.getHasBeenFertilized());
    }
    @Test
    public void testGetHasBeenHarvested() {
        Crop crop = new CornStalk();
        crop.setHasBeenHarvested(true);
        Assert.assertTrue(crop.getHasBeenHarvested());
    }
}
