package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.vehiclekinds.FarmVehicle;
import com.zipcodewilmington.froilansfarm.warehouses.Container;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;

import java.util.ArrayList;

public class CropDuster extends FarmVehicle implements AirCraft, Vehicle {
    private Pilot pilot;
    private Farm farm;
    private ArrayList<CropRow> field;

    public CropDuster(Farm farm) {
        this.farm = farm;
    }

    public String makeNoise() {
        return "Whir whir!";
    }

    public void operate(Farm farm) {
        fly();
    }

    //TODO
    public void fly() {
        // for each CropRow in field
        for (CropRow row : field) { //need getter: farm.getfield()
//            fertilize(row);
        }
    }

    public void fertilize(ArrayList<Crop> cropRow) {
        // for each crop in a CropRow
        for (Crop crop : cropRow) {
            crop.setHasBeenFertilized(true);
        }
    }
}
