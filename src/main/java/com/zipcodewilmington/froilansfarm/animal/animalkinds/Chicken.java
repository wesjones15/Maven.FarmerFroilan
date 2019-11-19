package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {

    public Double yield() {
        return null;
    }

    public String makeNoise() {
        return "Bawk";
    }
}
