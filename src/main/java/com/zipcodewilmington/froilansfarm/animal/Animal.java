package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

import java.util.ArrayList;

public abstract class Animal implements NoiseMaker, Eater {

    private ArrayList<Edible> stomachContents = new ArrayList<Edible>();
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public Animal(){
    }

    public void eat(Edible food) {
        stomachContents.add(food);
    }
    //later implement reset stomachContents after each day
    //get hunger level by checking size of stomachContents
    //ENUMS for HUNGRY, SATIATED, and FULL


    public ArrayList<Edible> getStomachContents() {
        return stomachContents;
    }

    public Integer emptyStomachContents() {
        this.stomachContents.clear();
        if (this.stomachContents.size() == 0) { return 0; }
        else { return -1;}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
