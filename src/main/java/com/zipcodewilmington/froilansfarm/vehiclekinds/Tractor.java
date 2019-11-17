package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import com.zipcodewilmington.froilansfarm.vehiclekinds.FarmVehicle;

public class Tractor extends FarmVehicle implements Vehicle {

    public String makeNoise() {
        return "Brrrn";
    }
}
