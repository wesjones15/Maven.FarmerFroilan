package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Chicken;
import com.zipcodewilmington.froilansfarm.vehiclekinds.CropDuster;
import com.zipcodewilmington.froilansfarm.vehiclekinds.Tractor;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {
    Farm farm;
    Stable stable;
    ChickenCoop chickenCoop;

    @Before
    public void setUp(){
        farm = new Farm();
        stable = new Stable();
        chickenCoop = new ChickenCoop();
    }

    @Test
    public void testConstructor(){

    }

    @Test
    public void testSetTractor(){
        Tractor vehicle = new Tractor();
        farm.setTractor(vehicle);
        Assert.assertEquals(vehicle, farm.getTractor());
    }

    @Test
    public void testSetCropDuster(){
        CropDuster vehicle = new CropDuster();
        farm.setCropDuster(vehicle);
        Assert.assertEquals(vehicle, farm.getCropDuster());
    }

    @Test
    public void testSetField(){
        Field field = new Field();
        farm.setField(field);
        Assert.assertEquals(field, farm.getField());
    }

    @Test
    public void testSetSilo(){
        Silo container = new Silo();
        farm.setSilo(container);
        Assert.assertEquals(container, farm.getSilo());
    }

    @Test
    public void testSetFarmHouse(){
        FarmHouse container = new FarmHouse();
        farm.setFarmHouse(container);
        Assert.assertEquals(container, farm.getFarmHouse());
    }

    @Test
    public void testSetChickenCoops(){
        farm.addChickenCoop();
        ArrayList<ChickenCoop> expected = new ArrayList<ChickenCoop>();
        expected.add(chickenCoop);
        Assert.assertTrue(expected.contains(chickenCoop));
    }

    @Test
    public void testSetStable(){
        farm.addStable();
        ArrayList<Stable> expected = new ArrayList<Stable>();
        expected.add(stable);
        Assert.assertTrue(expected.contains(stable));
    }
}
