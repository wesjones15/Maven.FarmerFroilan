package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Person;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class FarmHouse extends Container<Person> {

    public FarmHouse() {
        this.contents = new ArrayList<Person>();
    }

    public Farmer getFarmer() {
        Farmer farmer = null;
        for (Person person : contents) {
            if (person instanceof Farmer) {
                farmer = (Farmer) person;
                break;
            }
        }
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        for (Person person : contents) {
            if (person instanceof Farmer) {
                person = farmer;
                break;
            }
        }
    }

    public Pilot getPilot() {
        Pilot pilot = null;
        for (Person person : contents) {
            if (person instanceof Pilot) {
                pilot = (Pilot) person;
                break;
            }
        }
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        for (Person person : contents) {
            if (person instanceof Pilot) {
                person = pilot;
                break;
            }
        }
    }
}
