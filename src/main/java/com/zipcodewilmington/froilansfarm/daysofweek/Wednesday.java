package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;


public class Wednesday extends Day {

    public static Farm run(Farm farm){
        System.out.println("\n\n-------------------- WEDNESDAY --------------------\n");
        farm = morningActivities(farm);
        farm = lunchMeals(farm);
        farm = fertilize(farm);
        farm = harvest(farm);
        farm = dinnerMeals(farm);
        printDaySummary(farm);
        printMondayNarrative();
        promptEnterKey();
        return farm;
    }

    private static void printMondayNarrative() {
        System.out.println(
                "Things are normal on the farm.\n" +
                        "The chickens roost, the horses neigh, and Napoleon is enjoying the company of the other animals.\n" +
                        "The animals are happy it's hump day - they start making their plans for the weekend");
    }




}
