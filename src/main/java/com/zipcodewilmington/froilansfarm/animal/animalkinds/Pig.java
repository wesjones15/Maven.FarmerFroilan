package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Pig extends Animal implements Edible {

//    private String name;

    public String makeNoise() {
        if (this.getName() == "Napoleon") {return "Four legs good, two legs bad.";}
        else {return "Oink";}
    }

    public Pig(String name) {
        super(name);
    }

    public Pig(){
        super.setName("[Some Pig]");
    }

}
