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
    }
    public String makeNoise() {
        return "Bork";
    }
}
