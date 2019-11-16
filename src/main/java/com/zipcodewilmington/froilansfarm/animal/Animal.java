package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

import java.util.ArrayList;

public abstract class Animal implements NoiseMaker, Eater {
    ArrayList<Edible> stomachContents = new ArrayList<Edible>();

    public void eat(Edible food) {
        stomachContents.add(food);
    }
    //later implement reset stomachContents after each day
    //get hunger level by checking size of stomachContents
}
