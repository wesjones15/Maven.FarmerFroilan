package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.farm.field.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {
    @Test
    public void testAddChicken1() {
        CropRow cropRow = new CropRow();
        Crop crop = new CornStalk();

        cropRow.add(crop);
        Assert.assertEquals(crop, cropRow.get().get(0));
    }

    @Test
    public void testAddChicken2() {
        CropRow cropRow = new CropRow();
        Crop crop = new CornStalk();
        cropRow.add(crop);
        cropRow.add(crop);

        Assert.assertEquals(2, cropRow.get().size());
    }

    @Test
    public void testRemoveChicken() {
        CropRow cropRow = new CropRow();
        Crop crop = new CornStalk();
        cropRow.add(crop);
        cropRow.remove(crop);
        Assert.assertTrue(cropRow.get().isEmpty());
    }

    @Test
    public void testRemoveAll() {
        CropRow cropRow = new CropRow();
        Crop crop = new CornStalk();
        cropRow.add(crop);
        cropRow.add(crop);
        cropRow.removeAll();
        Assert.assertTrue(cropRow.get().isEmpty());
    }
}
