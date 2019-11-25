package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.ArrayList;
import java.util.HashMap;

public class Chicken extends Animal implements Produce, Edible {

    // maybe establish a map of names with int keys
    // then make the nullary constructor draw the name using a key and a random number generator
    // names could be [Breast], [Thigh], and [Fingers]

    private Boolean hasBeenFertilized;

//    private HashMap<Integer, String> chickenNames = new HashMap<Integer, String>();
//    chickenNames.set(1, "[Fingers]");
//    chickenNames.put(2, "[Breasts]");
//    chickenNames.put(3, "[Thighs]");
//    chickenNames.put(4, "[Nuggets]");

    private String[] chickenNames = new String[]{"[Fingers]", "[Breasts]", "[Thighs]", "[Nuggets]"};

    public Chicken(String name) {
        super(name);
    }

    public Chicken(){
        super.setName(chickenNames[((int)(Math.random() * ((3-0)+1)))]);
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
