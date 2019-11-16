package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable, Edible {

<<<<<<< HEAD
    public String makeNoise() {
        return "Neigh";
=======
    public void eat() {

    }

    public String makeNoise() {
        return null;
>>>>>>> bd8c3575d3d01cb7ef401f653b15c1527075c86c
    }
}
