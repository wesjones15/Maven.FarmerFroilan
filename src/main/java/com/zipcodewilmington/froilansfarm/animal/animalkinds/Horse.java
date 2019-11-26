package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable, Edible {
    public Boolean hasBeenRidden = false;
    public String makeNoise() {
        return "Neigh";
    }

    private String[] horseNames = new String[]{"Boxer", "Mollie", "Clover", "Benjamin"};

    public Horse(String name) {
        super(name);
    }

    public Horse(){
        super.setName(horseNames[((int)(Math.random() * ((3-0)+1)))]);
    }

    public Boolean getHasBeenRidden() { return hasBeenRidden; }
    public void setHasBeenRidden(Boolean ridden) {
        this.hasBeenRidden = ridden;
    }


}
