package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {
    @Test
    public void testAddChicken1() {
        Field field = new Field();
        CropRow cropRow = new CropRow();
        field.add(cropRow);
        Assert.assertEquals(cropRow, field.get().get(0));
    }

    @Test
    public void testAddChicken2() {
        Field field = new Field();
        CropRow cropRow = new CropRow();
        field.add(cropRow);
        field.add(cropRow);

        Assert.assertEquals(2, field.get().size());
    }

    @Test
    public void testRemoveChicken() {
        Field field = new Field();
        CropRow cropRow = new CropRow();
        field.add(cropRow);
        field.remove(cropRow);
        Assert.assertTrue(field.get().isEmpty());
    }

    @Test
    public void testRemoveAll() {
        Field field = new Field();
        CropRow cropRow = new CropRow();
        field.add(cropRow);
        field.add(cropRow);
        field.removeAll();
        Assert.assertTrue(field.get().isEmpty());
    }
}
