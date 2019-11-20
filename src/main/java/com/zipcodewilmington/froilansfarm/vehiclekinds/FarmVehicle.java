package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.peoplekinds.Person;

public abstract class FarmVehicle {
    Rider rider;

    public abstract void operate(Farm farm);

    public abstract Boolean mount(Person rider);
    public void dismount() {
        rider = null;
    }
}
