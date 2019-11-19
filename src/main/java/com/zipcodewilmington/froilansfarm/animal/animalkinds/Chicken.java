package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce, Edible {

    // maybe establish a map of names with int keys
    // then make the nullary constructor draw the name using a key and a random number generator
    // names could be [Breast], [Thigh], and [Fingers]

    private Boolean hasBeenFertilized;

    public Chicken(String name) {
        super(name);
    }

    public Chicken(){
        super.setName("[Fingers]");
    }

    public Edible yield() {
        if (hasBeenFertilized == false){
            return new EdibleEgg();
        }
        else {return null;}
    }

    public Boolean fertilize() {
            setHasBeenFertilized(true);
            if (hasBeenFertilized == true) {return true;}
            return false;
    }

    public String makeNoise() {
        return "Bawk";
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

//    public ArrayList<Edible> getEggs() {
//        return eggs;
//    }
//
//    public void setEggs(ArrayList<Edible> eggs) {
//        this.eggs = eggs;
//    }
//
//    public Integer countEggs(ArrayList<Edible> eggs){
//        return this.eggs.size();
//    }

}