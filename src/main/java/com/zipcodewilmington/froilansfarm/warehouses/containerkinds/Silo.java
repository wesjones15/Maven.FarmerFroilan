package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class Silo extends Container<Edible> {

    //

    public Silo() {
        this.contents = new ArrayList<Edible>();
    }
}
