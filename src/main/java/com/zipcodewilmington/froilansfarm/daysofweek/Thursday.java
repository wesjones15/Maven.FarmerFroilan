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
                "There is a growing unease on the farm.\n" +
                        "Some things remain the same. The chickens roost, the horses neigh, and your puppy keeps getting wetter.\n" +
                        "However, a sad turn of events, Old Major has succumbed to old age.\n" +
                        "This upsets many of the animals, and the farm is noisier than usual as their cries replace the usual calm of farm life.");
    }

}
