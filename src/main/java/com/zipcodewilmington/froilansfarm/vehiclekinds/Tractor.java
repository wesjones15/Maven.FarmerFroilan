package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Person;
import com.zipcodewilmington.froilansfarm.vehiclekinds.FarmVehicle;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Silo;

import java.util.ArrayList;

public class Tractor extends FarmVehicle implements Vehicle {
//    Farm farm;
    Person farmer;
//    Rideable ride;
//    ArrayList<CropRow> field;

    public Tractor() {
        this.farmer = null;
    }

    public String makeNoise() {
        return "Brrrn";
    }

    //TODO call this method before calling operate
    public Boolean mount(Person rider) {
        if (rider instanceof Farmer) {
            farmer = rider;
            farmer.mount(this);
            return true;
        }
        return false;
    }

    public Farm operate(Farm farm) {

        // for each croprow in field in farm
        Field field = farm.getField();
        Silo silo = farm.getSilo();



        for (CropRow cropRow : field.get()) { // farm.getField().getCropRows()) {
            silo.addAll(harvest(cropRow));
        }
        farmer.dismount();
        this.dismount();
        farm.setSilo(silo);
        System.out.println("Ridin' my tractor to get these crops harvested!");
        return farm;

    }


    public ArrayList<Edible> harvest(CropRow cropRow) {
        ArrayList<Edible> harvestYield = new ArrayList<Edible>();
        for (Crop crop : cropRow.get()) {
            Edible food = crop.yield();
            if (food != null) {
                harvestYield.add(food);
            }
        }

        return harvestYield;
    }
}
