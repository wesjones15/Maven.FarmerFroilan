package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.vehiclekinds.FarmVehicle;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;

import java.util.ArrayList;

public class Tractor extends FarmVehicle implements Vehicle {
    Farm farm;
    Farmer farmer;
    Rideable ride;
    ArrayList<CropRow> field;

    public Tractor(Farm farm) {
        this.farm = farm;
    }

    public String makeNoise() {
        return "Brrrn";
    }

    //TODO
    public void operate(Farm farm) {
        farmer.mount(ride);
        // for each croprow in field in farm
        for (CropRow row : field) { // farm.getField().getCropRows()) {
//            harvest(row);
        }
        farmer.dismount();
    }

    public void harvest(ArrayList<Crop> cropRow) {
        for (Crop crop : cropRow) {
            crop.setHasBeenHarvested(true);
        }
    }
}
