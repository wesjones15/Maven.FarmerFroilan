package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import com.zipcodewilmington.froilansfarm.peoplekinds.Person;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;

import java.util.ArrayList;

public class CropDuster extends FarmVehicle implements AirCraft, Vehicle {
    private Person pilot;
    private Boolean flying;

    public CropDuster() {
        pilot = null;
        flying = false;
    }

    public String makeNoise() {
        return "Whir whir!";
    }

    public Boolean mount(Person rider) {
        if (rider instanceof Pilot) {
            this.pilot = rider;
            pilot.mount(this);
            return true;
        }
        return false;
    }

    public Farm operate(Farm farm) {
        fly();
        Field field = farm.getField();
        for (CropRow cropRow : field.get()) {
            fertilize(cropRow);
        }
        land();
        pilot.dismount();
        this.dismount();
        farm.setField(field);
        return farm;
    }

    public Boolean fly() {
        flying = (pilot instanceof Pilot);
//        if (pilot instanceof Pilot) {
//            flying = true;
//        } else flying = false;
        return flying;
    }

    public Boolean land() {
        flying = false;
        return flying;
    }

    public void fertilize(CropRow cropRow) {
        // for each crop in a CropRow
        for (Crop crop : cropRow.get()) {
            crop.setHasBeenFertilized(true);
        }
//        return cropRow;
    }
}
