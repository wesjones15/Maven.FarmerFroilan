package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.animal.animalkinds.Chicken;
import com.zipcodewilmington.froilansfarm.vehiclekinds.CropDuster;
import com.zipcodewilmington.froilansfarm.vehiclekinds.Tractor;
import com.zipcodewilmington.froilansfarm.warehouses.Container;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.ChickenCoop;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.FarmHouse;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;

import java.util.ArrayList;

public class Farm {
    private Tractor tractor;
    private CropDuster cropDuster;
    private Field field;
//    private Silo silo;
    private FarmHouse farmHouse;
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<Stable> stables;

    public Farm(Tractor tractor, CropDuster cropDuster, Field field, FarmHouse farmHouse, ArrayList<ChickenCoop> chickenCoops, ArrayList<Stable> stables){
        this.tractor = tractor;
        this.cropDuster = cropDuster;
        this.field = field;
//        this.silo = silo;
        this.farmHouse = farmHouse;
        this.chickenCoops = chickenCoops;
        this.stables = stables;
    }

    public Farm() {
        this(new Tractor(), new CropDuster(), new Field(), new FarmHouse(), new ArrayList<ChickenCoop>(), new ArrayList<Stable>());
    }





}
