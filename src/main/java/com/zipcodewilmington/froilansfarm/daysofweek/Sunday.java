package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.farm.field.TomatoPlant;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;

public class Sunday extends Day {
    public static Farm run(Farm farm) {
        System.out.println("\n\n-------------------- SUNDAY --------------------\n");
        farm = morning(farm);
        farm = plantField(farm);
        System.out.println("Froilan spends all day planting the fields.");
        printDaySummary(farm);
        System.out.println();
        printSundayNarrative();
        promptEnterKey();
        return farm;
    }

    public static Farm plantField(Farm farm) {
        Farmer farmer = farm.getFarmHouse().getFarmer();
        Crop[] crops = {new CornStalk(), new TomatoPlant(), new CornStalk(), new CornStalk(), new TomatoPlant()};
        Field field = farm.getField();
        for (int i = 0; i < 5; i++) {
            CropRow cropRow;
            if (crops[i] instanceof CornStalk) {
                cropRow = plantCorn(farmer);
            }
            else if (crops[i] instanceof TomatoPlant) {
                cropRow = plantTomato(farmer);
            }
            else {
                cropRow = plantCorn(farmer);
            }
            field.add(cropRow);
        }
        farm.setField(field);
        return farm;
    }

    public static CropRow plantCorn(Farmer farmer) {
        CropRow cropRow = new CropRow();
        for (int j = 0; j < 500; j++) {
            cropRow = farmer.plant(new CornStalk(), cropRow);
        }
        return cropRow;
    }

    public static CropRow plantTomato(Farmer farmer) {
        CropRow cropRow = new CropRow();
        for (int j = 0; j < 500; j++) {
            cropRow = farmer.plant(new TomatoPlant(), cropRow);
        }
        return cropRow;
    }

    public static void printSundayNarrative(){
        System.out.println(
                "All is well on the farm.\n" +
                "Your chickens and horses are content.\n" +
                "Your prize pig, Napoleon, is happy.\n" +
                "Your puppy is wet.");
    }

}
