package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.animal.animalkinds.Chicken;
import com.zipcodewilmington.froilansfarm.warehouses.Container;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.ChickenCoop;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.FarmHouse;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;

import java.util.ArrayList;

public class Farm {
    FarmHouse farmHouse;
    ArrayList<ChickenCoop> chickenCoops;
    ArrayList<Stable> stables;

    public Farm() {
        farmHouse = new FarmHouse();
        chickenCoops = new ArrayList<ChickenCoop>();
        stables = new ArrayList<Stable>();
        for (int i = 0; i < 4; i++) {
            chickenCoops.add(new ChickenCoop(0));
        }
        for (int i = 0; i < 3; i++) {
            stables.add(new Stable());
        }
    }



}
