package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.field.TomatoPlant;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Person;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    @Test
    public void testMakeNoise(){
        CropDuster cd = new CropDuster();
        String expected = "Whir whir!";
        String actual = cd.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount() {
        Person pilot = new Pilot("Froilanda");
        CropDuster cropDuster = new CropDuster();
        cropDuster.mount(pilot);
        Assert.assertTrue(cropDuster.fly());
    }

    @Test
    public void testOperate() {
        Person pilot = new Pilot("Froilanda");
        Farm farm = new Farm();
        CropDuster cropDuster = farm.getCropDuster();
        farm.getField().add(new CropRow());
        farm.getField().add(new CropRow());
        farm.getField().get().get(0).add(new CornStalk());
        farm.getField().get().get(0).add(new TomatoPlant());
        farm.getField().get().get(0).add(new CornStalk());
        farm.getField().get().get(1).add(new TomatoPlant());
        farm.getField().get().get(1).add(new CornStalk());
        farm.getField().get().get(1).add(new CornStalk());
        cropDuster.mount(pilot);
        cropDuster.operate(farm);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertTrue(farm.getField().get().get(i).get().get(j).getHasBeenFertilized());
            }
        }
    }

}
