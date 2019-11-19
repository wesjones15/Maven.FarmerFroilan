package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class Field extends Container<CropRow> {

    public Field() {
        this.contents = new ArrayList<CropRow>();
    }

}

