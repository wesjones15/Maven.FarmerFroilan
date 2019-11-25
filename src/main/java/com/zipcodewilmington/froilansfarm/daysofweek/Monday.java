package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.vehiclekinds.CropDuster;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;

public class Monday extends Day {
    public static Farm run(Farm farm) {
        farm = morningActivities(farm);
        farm = fertilize(farm);
        return farm;
    }

    public static Farm fertilize(Farm farm) {
        Pilot pilot = farm.getFarmHouse().getPilot();
        CropDuster cropDuster = farm.getCropDuster();
        cropDuster.mount(pilot);
        farm = cropDuster.operate(farm);
        return farm;
    }



}
