package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.farm.field.TomatoPlant;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.utils.Console;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;

public class Sunday extends Day {
    public static Farm run(Farm farm) {
        Console.println("\n\n-------------------- SUNDAY --------------------\n");
        farm = morningActivities(farm);
        farm = plantField(farm);
        printDaySummary(farm);
        Console.println("");
        printSundayNarrative();
        promptEnterKey();
        return farm;
    }

    public static void printSundayNarrative(){
        Console.println(
                "All is well on the farm.\n" +
                "Your chickens and horses are content.\n" +
                "Your prize pig, Napoleon, is happy.\n" +
                "Your puppy is wet.");
    }

}
