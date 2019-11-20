package com.zipcodewilmington.froilansfarm.peoplekinds;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Botanist, Eater {
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
        //10 horses across 3 stables  flag for ridden to = true?  or a count?

    }

    public void feed(Horse horse, EarOfCorn corn){
        //each  horse gets 3 earsOfCorn
        //their stomach contents will increase by 3 and the silo/storge of EarOfCorn will decrement by 3
    }

    public void eat() {


    }

    public String makeNoise() {
        return "Yee Yee";
    }


}
