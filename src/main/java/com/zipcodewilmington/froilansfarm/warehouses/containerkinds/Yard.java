package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Pig;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class Yard extends Container<Pig> {

    public Yard(){
        this.contents = new ArrayList<Pig>();
    }

    public Pig getPig(){
        Pig pig = null;
        for (Pig thisone : contents) {
            if (thisone instanceof Pig){
                pig = (Pig) thisone;
                break;
            }
        }
        return pig;
    }

    public void setPig(Pig pig) {
        for (Pig thisone : contents){
            if (thisone instanceof Pig){
                thisone = pig;
                break;
            }
        }
    }

}
