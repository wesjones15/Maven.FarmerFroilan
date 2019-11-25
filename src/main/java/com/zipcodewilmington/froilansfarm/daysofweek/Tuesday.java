package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.vehiclekinds.Tractor;

public class Tuesday extends Day {
    public static Farm run(Farm farm) {
        System.out.println("\n\n-------------------- TUESDAY --------------------\n");
        farm = morning(farm);
        farm = harvest(farm);
        printDaySummary(farm);
        printTuesdayNarrative();
        promptEnterKey();
        return farm;
    }

    public static Farm harvest(Farm farm) {
        Farmer farmer = farm.getFarmHouse().getFarmer();
        Tractor tractor = farm.getTractor();
        tractor.mount(farmer);
        farm = tractor.operate(farm);
        return farm;
    }

    private static void printTuesdayNarrative() {
        System.out.println(
                "All is well on the farm.\n" +
                "The chickens roost, the horses neigh, and your puppy keeps getting wetter.");
        promptEnterKey();
        System.out.println("\n\n-------------------- TUESDAY NIGHT --------------------\n" +
                "Froilan wakes up in the middle of the night and sees lights in the barn.\n" +
                "All of the animals seem to be congregating in the barn, and Napoleon is in the center making noises.\n" +
                "\"It's probably nothing\", Froilan thinks, and goes back to bed, unconcerned.");
    }

}
