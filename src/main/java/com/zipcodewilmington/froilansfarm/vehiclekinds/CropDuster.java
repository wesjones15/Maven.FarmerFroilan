package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

public class CropDuster extends FarmVehicle implements AirCraft, Vehicle {

    public String makeNoise() {
        return null;
    }

    public void fly() {

    }
}
