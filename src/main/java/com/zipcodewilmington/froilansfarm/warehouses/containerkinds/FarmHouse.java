package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.peoplekinds.Person;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class FarmHouse extends Container<Person> {

    public FarmHouse() {
        this.contents = new ArrayList<Person>();
    }
}
