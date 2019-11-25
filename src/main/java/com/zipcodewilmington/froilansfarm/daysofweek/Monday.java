package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.vehiclekinds.CropDuster;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;

public class Monday extends Day {
    public static Farm run(Farm farm) {
        System.out.println("\n\n-------------------- MONDAY --------------------\n");
        farm = morning(farm);
        farm = fertilize(farm);
        printDaySummary(farm);
        printMondayNarrative();
        promptEnterKey();
        return farm;
    }

    public static Farm fertilize(Farm farm) {
        Pilot pilot = farm.getFarmHouse().getPilot();
        CropDuster cropDuster = farm.getCropDuster();
        cropDuster.mount(pilot);
        farm = cropDuster.operate(farm);
        System.out.println("Froilanda fertilizes all of the crops in her crop duster.");
        return farm;
    }

    private static void printMondayNarrative() {
        System.out.println(
                "All is well on the farm.\n" +
                "The chickens roost, the horses neigh, and Napoleon is enjoying the company of the other animals.");
    }

}
