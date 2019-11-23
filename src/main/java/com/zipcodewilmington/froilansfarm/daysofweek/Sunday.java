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
        farm = morningMeals(farm);
        farm = plantField(farm);

        return farm;
    }

    public static Farm plantField(Farm farm) {
        Farmer farmer = farm.getFarmHouse().getFarmer();
        Crop[] crops = {new CornStalk(), new TomatoPlant(), new CornStalk(), new CornStalk(), new TomatoPlant()};
        Field field = farm.getField();
        for (int i = 0; i < 5; i++) {
            Crop crop = crops[i];
            CropRow cropRow = plantRow(crop, farmer);
            field.add(cropRow);
        }
        farm.setField(field);
        return farm;
    }

    public static CropRow plantRow(Crop crop, Farmer farmer) {
        CropRow cropRow = new CropRow();
        for (int j = 0; j < 500; j++) {
            cropRow = farmer.plant(crop, cropRow);
        }
        return cropRow;
    }
}