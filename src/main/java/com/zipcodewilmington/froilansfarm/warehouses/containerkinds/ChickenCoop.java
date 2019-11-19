package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Chicken;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class ChickenCoop extends Container<Chicken> {

    public ChickenCoop() {
        this.contents = new ArrayList<Chicken>();
    }
}
