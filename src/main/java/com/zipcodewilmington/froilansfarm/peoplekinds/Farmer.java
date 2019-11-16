package com.zipcodewilmington.froilansfarm.peoplekinds;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Farmer extends Person implements Botanist {
    private Rideable ride = null;

    public Farmer(){}

    public void plant() {
    }

    public String makeNoise() {
        return "Yee Yee";
    }

}
