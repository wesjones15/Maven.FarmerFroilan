package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {
    protected Boolean hasBeenFertilized;
    protected Boolean hasBeenHarvested;

<<<<<<< HEAD
    //TODO make yield abstract
    // return type Edible
    public Edible yield() {
        return null;
    }

    public Boolean fertilize() {
        return null;
    }
=======
    public abstract Edible yield();
//try to implement yield to only be accessed in crop for our edible foods.
>>>>>>> dev

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
