package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.field.TomatoPlant;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Person;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Silo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TractorTest {
    Farm farm;
    Tractor tractor;
    Person farmer;

    @Before
    public void setUp() {
        farm = new Farm();
        tractor = farm.getTractor();
        farmer = new Farmer("Froilan");
    }

    @Test
    public void testMakeNoise(){
        Tractor tractor = new Tractor();
        String expected = "Brrrn";
        String actual = tractor.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMount1() {
        Assert.assertTrue(tractor.mount(farmer));
    }

    @Test
    public void testMount2() {
        Person testPerson = new Pilot("Froi");
        Assert.assertFalse(tractor.mount(testPerson));
    }

    @Test
    public void testOperate1() {
        farm.getField().add(new CropRow());
        farm.getField().add(new CropRow());
        farm.getField().get().get(0).add(new CornStalk());
        farm.getField().get().get(0).add(new TomatoPlant());
        farm.getField().get().get(0).add(new CornStalk());
        farm.getField().get().get(1).add(new TomatoPlant());
        farm.getField().get().get(1).add(new CornStalk());
        farm.getField().get().get(1).add(new CornStalk());


        Pilot pilot = new Pilot("Froilanda");
        CropDuster cropDuster = farm.getCropDuster();
        cropDuster.mount(pilot);
        cropDuster.operate(farm);

        tractor.mount(farmer);
        tractor.operate(farm);

        Silo silo = farm.getSilo();

        Integer actual = silo.size();
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOperate2() {
        farm.getField().add(new CropRow());
        farm.getField().add(new CropRow());
        farm.getField().get().get(0).add(new CornStalk());
        farm.getField().get().get(0).add(new TomatoPlant());
        farm.getField().get().get(0).add(new CornStalk());
        farm.getField().get().get(1).add(new TomatoPlant());
        farm.getField().get().get(1).add(new CornStalk());
        farm.getField().get().get(1).add(new CornStalk());

        tractor.mount(farmer);
        tractor.operate(farm);

        Silo silo = farm.getSilo();
        // should be zero because crops are unfertilized
        Assert.assertEquals((Integer) 0, silo.size());
    }

}
