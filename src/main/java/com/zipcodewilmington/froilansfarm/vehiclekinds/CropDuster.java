package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;

import java.util.ArrayList;

public class CropDuster extends FarmVehicle implements AirCraft, Vehicle {
    Rideable ride;
    private Farm farm;
    private Pilot pilot;

    public CropDuster(Farm farm) {
        this.farm = farm;
    }

    public String makeNoise() {
        return "Whir whir!";
    }

    public void operate(Farm farm) {
        pilot.mount();
        fly();
        pilot.dismount();
    }

    //TODO
    public void fly() {
        // for each CropRow in field
//        for (CropRow row : field) { //need getter: farm.getfield()
//            fertilize(row);
//        }
    }

    public void fertilize(ArrayList<Crop> cropRow) {
        // for each crop in a CropRow
        for (Crop crop : cropRow) {
            crop.setHasBeenFertilized(true);
        }
    }
}
