package com.zipcodewilmington.froilansfarm.peoplekinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public abstract class Person extends Animal implements Rider, Eater {
    private Rideable ride = null;

    public void mount(Rideable ride) {
        this.ride = ride;
    }

    public void dismount() {
        this.ride = null;
    }



}
