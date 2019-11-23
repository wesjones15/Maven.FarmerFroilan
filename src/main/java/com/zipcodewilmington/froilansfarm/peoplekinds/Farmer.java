package com.zipcodewilmington.froilansfarm.peoplekinds;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist {
    private ArrayList<Edible> stomachContents;
    private String name;

    public Farmer(String name){
        this.name = "Ol Farmer Froilan";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public CropRow plant(Crop crop, CropRow cropRow) {
        cropRow.add(crop);
        return cropRow;
    }


    public void ride(Farm farm, Horse horse, Stable stable) {

        //10 horses across 3 stables  flag for ridden to = true?  or a count?

    }

    public void feed(Horse horse, EarOfCorn corn){
        //each  horse gets 3 earsOfCorn
        //their stomach contents will increase by 3 and the silo/storge of EarOfCorn will decrement by 3
        //Stable contents ArrayList of <Horse>
    }

//    public void eat(Edible food, Integer quantity) {
        //Froilan eats 1 earCorn so silo contents of corn will decrement by 1 and his stomachContents will increase by 1
        //Eats 2 tomato  - silo tomato count will decrement by 2 and stomach contents will be added
        //Eats 5 eggs  - wherever we keep eggs, decrement by two, add two eggs to stomach contents arraylist

//    }


    //cropRow index 0 is Corn, cropRow index 1 is Tomato, and cropRow index 3+ some sort of arbitrary crop
    public void plant (Farm farm) {


    }

//    public void eat(Edible food) {
//        this.stomachContents.add(food);
//    }




//    @Override
//    public ArrayList<Edible> getStomachContents() {
//        return stomachContents;
//    }

    @Override
    public String toString() {
        return "Farmer{" +
                "stomachContents=" + stomachContents +
                ", name='" + name + '\'' +
                '}';
    }

    public String makeNoise() {
        return "Yee Yee";
    }


}
