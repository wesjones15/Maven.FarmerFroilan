package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class Stable extends Container<Horse> {

    public Stable() {
        this.contents = new ArrayList<Horse>();
    }
}
