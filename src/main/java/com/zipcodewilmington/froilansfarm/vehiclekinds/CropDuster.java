package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import com.zipcodewilmington.froilansfarm.vehiclekinds.FarmVehicle;

public class CropDuster extends FarmVehicle implements AirCraft, Vehicle {

    public String makeNoise() {
        return "Neowww";
    }

    public void fly() {

    }
}
