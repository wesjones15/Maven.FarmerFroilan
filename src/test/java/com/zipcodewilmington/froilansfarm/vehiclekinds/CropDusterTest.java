package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

public class CropDusterTest extends FarmVehicleTest implements AirCraft, Vehicle {

    public String makeNoise() {
        return null;
    }

    public void fly() {

    }
}
