package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class CropRow extends Container<Crop> {

    public CropRow() {
        this.contents = new ArrayList<Crop>();
    }
}

//cropRow index 0 is Corn, cropRow index 1 is Tomato, and cropRow index 3+ some sort of arbitrary crop