package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.utils.Console;

public class Thursday extends Day {

    public static Farm run(Farm farm) {
        Console.println("\n\n-------------------- THURSDAY --------------------\n");
        farm = morningActivities(farm);
        farm = lunchMeals(farm);
        farm = dinnerMeals(farm);
        farm = harvest(farm);
        farm = feedHorses(farm);
        printDaySummary(farm);
        printThursdayNarrative();
        return farm;
    }

    private static void printThursdayNarrative() {
        Console.println(
                "All is well on the farm.\n" +
                        "The chickens roost, the horses neigh, and your puppy keeps getting wetter.");
    }

}
