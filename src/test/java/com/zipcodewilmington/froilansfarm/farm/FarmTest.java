package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.vehiclekinds.CropDuster;
import com.zipcodewilmington.froilansfarm.vehiclekinds.Tractor;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.ChickenCoop;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.FarmHouse;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Silo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {
    Farm farm;

    @Before
    public void setUp(){
        farm = new Farm();
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

//    @Test
//    public void testSetChickenCoops(){
//        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
//        farm.setFarmHouse(container);
//        Assert.assertEquals(container, farm.getFarmHouse());
//    }
}
