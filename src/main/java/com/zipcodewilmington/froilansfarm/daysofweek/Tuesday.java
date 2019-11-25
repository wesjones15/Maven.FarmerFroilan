package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.vehiclekinds.Tractor;

public class Tuesday extends Day {
    public static Farm run(Farm farm) {
        farm = morningActivities(farm);
        farm = harvest(farm);
        return farm;
    }

    public static Farm harvest(Farm farm) {
        Farmer farmer = farm.getFarmHouse().getFarmer();
        Tractor tractor = farm.getTractor();
        tractor.mount(farmer);
        farm = tractor.operate(farm);
        return farm;
    }
}
