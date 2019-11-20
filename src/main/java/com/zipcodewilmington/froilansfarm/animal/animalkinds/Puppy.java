package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Puppy extends Animal implements Edible {

    private Boolean isWet = true;

    public Puppy(String name) {
        super(name);
    }

    public Puppy(){
        super.setName("[Wet Puppy]");
        this.isWet = isWet;
    }
    public String makeNoise() {
        return "Bork";
    }

    public Boolean getWet() {
        return isWet;
    }

    public void setWet(Boolean wet) {
        isWet = wet;
    }

}
