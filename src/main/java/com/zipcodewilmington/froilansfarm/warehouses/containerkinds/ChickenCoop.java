package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.animal.animalkinds.Chicken;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class ChickenCoop extends Container<Chicken> {

    public ChickenCoop(ArrayList<Chicken> chickens) {
        super(chickens);
    }

    public ChickenCoop(Integer numberOfChickens) {
        super(numberOfChickens);
        for (int i = 0; i < numberOfChickens; i++) {
            this.contents.add(new Chicken());
        }
    }

//    public ArrayList<Chicken> getChickens() {
//        return this.contents;
//    }

}
