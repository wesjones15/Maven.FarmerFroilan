package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Silo;

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

    public Farm eatMeal(Edible[] meal, Farm farm) {
        Silo silo = farm.getSilo();
        for (Edible food : meal) {
            Edible morsel = silo.getFood(food);
            if (morsel == null) {
                // we don't have any of that food
                break;
            }
            eat(morsel);
        }
        farm.setSilo(silo);
        return farm;
    }

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
