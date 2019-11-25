package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class CornStalk extends Crop {
    public CornStalk() {
        hasBeenFertilized = false;
        hasBeenHarvested = false;
    }

    public Edible yield() {
        if(hasBeenFertilized && !hasBeenHarvested){
            hasBeenHarvested = true;
            return new EarOfCorn();
        }
        return null;
    }
}
