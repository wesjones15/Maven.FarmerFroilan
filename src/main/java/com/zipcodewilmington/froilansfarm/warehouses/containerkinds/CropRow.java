package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class CropRow extends Container<Crop> {

    public CropRow() {
        this.contents = new ArrayList<Crop>();
    }
}

