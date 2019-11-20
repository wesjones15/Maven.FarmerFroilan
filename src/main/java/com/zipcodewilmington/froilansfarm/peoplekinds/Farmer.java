package com.zipcodewilmington.froilansfarm.peoplekinds;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist {
    private Rideable ride = null;
    private ArrayList<Edible> stomachContents;
    private String name;

    public Farmer(String name){
        this.name = "Ol Farmer Froilan";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void plant(Edible edible, CropRow cropRow ) {

    }

    public void ride(Horse horse, Stable stable) {


    }

    public void feed(Horse horse, EarOfCorn corn){


    }

    public String makeNoise() {
        return "Yee Yee";
    }

}
